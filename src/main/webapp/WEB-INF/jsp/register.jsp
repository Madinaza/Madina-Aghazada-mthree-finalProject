<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>
    <h2>Register</h2>
    <form action="/register" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required autocomplete="username"><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required autocomplete="new-password"><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required autocomplete="email"><br>

        <button type="submit">Register</button>
    </form>
</body>
</html>
