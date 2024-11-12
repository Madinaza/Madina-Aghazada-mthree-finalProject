<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <form action="/login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required autocomplete="username"><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required autocomplete="current-password"><br>

        <button type="submit">Login</button>
    </form>

    <div th:if="${not empty error}">
        <p style="color: red;">Invalid username or password.</p>
    </div>
</body>
</html>
