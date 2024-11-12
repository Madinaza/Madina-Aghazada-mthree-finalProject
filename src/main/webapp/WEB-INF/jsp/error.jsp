<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Error Page</title>
</head>
<body>
    <div class="container">
        <h1>Oops! Something went wrong.</h1>
        <p>There was an unexpected error. Please try again later.</p>
        <p>Error Code: ${status}</p>
        <div>
            <a href="${pageContext.request.contextPath}/">Go Back to Home</a>
        </div>
    </div>
</body>
</html>
