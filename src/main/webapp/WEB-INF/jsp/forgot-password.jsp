<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Forgot Password</title>
    <link rel="stylesheet" href="/static/style.css">
</head>
<body>
<div class="container" style="width: 400px; margin: auto; padding: 20px; border-radius: 10px; box-shadow: 0px 0px 15px 0px rgba(0,0,0,0.2); background-color: #f9f9f9;">
    <form action="/user/forgot-password" method="post" class="form-container">
        <h2>Forgot Password</h2>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required style="width: 100%; padding: 10px; margin-bottom: 15px;">

        <button type="submit" style="width: 100%; padding: 10px; background-color: #ff9800; color: white; border: none; border-radius: 5px;">Submit</button>

        <p><a href="/login">Back to Login</a></p>
    </form>
</div>
</body>
</html>
