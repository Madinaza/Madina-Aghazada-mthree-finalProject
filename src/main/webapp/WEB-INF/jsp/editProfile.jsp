<!DOCTYPE html>
<html>
<head>
    <title>Edit Profile</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h2>Edit Profile</h2>
    <form action="updateProfile" method="post">
        <label>Username:</label>
        <input type="text" name="username" value="${user.username}" required><br>

        <label>Password:</label>
        <input type="password" name="password" placeholder="Enter new password"><br>

        <label>Email:</label>
        <input type="email" name="email" value="${user.email}" required><br>

        <button type="submit">Update</button>
    </form>
    <a href="dashboard">Cancel</a>
</body>
</html>
