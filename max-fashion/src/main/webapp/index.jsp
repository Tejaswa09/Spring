<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page  isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Puma</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            background-image: url('https://exchange4media.gumlet.io/news-photo/130137-PUMA_DIVE_Virat-Kohli.jpg'); /* Puma running shoes theme */
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            font-family: Arial, sans-serif;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            color: white;
        }

        .container {
            background-color: rgba(0, 0, 0, 0.7);
            padding: 30px 40px;
            border-radius: 15px;
            text-align: center;
        }

        input[type="text"] {
            padding: 10px;
            margin: 10px 0;
            width: 100%;
            border: none;
            border-radius: 5px;
        }

        button {
            padding: 10px 20px;
            background-color: #e60012;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-weight: bold;
        }

        h1 {
            margin-bottom: 20px;
            text-shadow: 2px 2px 4px black;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome User!!</h1>
        <form action="userRegister" method="post">
            First Name<input type="text" name="firstName" placeholder="Enter first name"><br>
            Last Name<input type="text" name="lastName" placeholder="Enter last name"><br>
            DOB<input type="text" name="dateOfBirth" placeholder="Date of birth"><br>
            Email<input type="text" name="email" placeholder="Enter email"><br>
            <button type="submit">Register</button>
        </form>
    </div>
</body>
</html>
