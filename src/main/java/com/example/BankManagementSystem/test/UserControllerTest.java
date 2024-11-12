package com.example.BankManagementSystem.test;

import com.example.BankManagementSystem.controller.UserController;
import com.example.BankManagementSystem.model.User;
import com.example.BankManagementSystem.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void registerUserTest() throws Exception {
        User user = new User();
        user.setUsername("john_doe");
        user.setPassword("password123");
        user.setEmail("john.doe@example.com");

        Mockito.when(userService.saveUser(Mockito.any(User.class))).thenReturn(user);

        String userJson = objectMapper.writeValueAsString(user);

        mockMvc.perform(post("/api/users/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson))
                .andExpect(status().isCreated());
    }

    @Test
    void loginUserTest() throws Exception {
        User user = new User();
        user.setUsername("john_doe");
        user.setPassword("password123");

        Mockito.when(userService.findByUsername(Mockito.anyString())).thenReturn(user);
        Mockito.when(userService.checkPassword(Mockito.anyString(), Mockito.anyString())).thenReturn(true);

        String loginJson = objectMapper.writeValueAsString(user);

        mockMvc.perform(post("/api/users/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(loginJson))
                .andExpect(status().isOk());
    }
}
