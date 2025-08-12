<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register for Book Haven</title>
    <style>
        /* Basic CSS for a clean and modern look */
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap');

        :root {
            --primary-color: #5D4037; /* A warm, bookish brown */
            --secondary-color: #EFEBE9;
            --error-color: #D32F2F;
            --success-color: #388E3C;
            --text-color: #333;
            --border-color: #BDBDBD;
        }

        body {
            font-family: 'Poppins', sans-serif;
            background-color: var(--secondary-color);
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
            color: var(--text-color);
        }

        .container {
            background-color: #fff;
            padding: 2rem 2.5rem;
            border-radius: 10px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        h1 {
            color: var(--primary-color);
            text-align: center;
            margin-bottom: 1.5rem;
            font-weight: 600;
        }

        .form-group {
            margin-bottom: 1.25rem;
            position: relative;
        }

        .form-group label {
            display: block;
            margin-bottom: 0.5rem;
            font-weight: 500;
        }

        .form-group input {
            width: 100%;
            padding: 0.75rem;
            border: 1px solid var(--border-color);
            border-radius: 5px;
            font-size: 1rem;
            box-sizing: border-box;
            transition: border-color 0.3s;
        }

        .form-group input:focus {
            outline: none;
            border-color: var(--primary-color);
        }

        .error-message {
            color: var(--error-color);
            font-size: 0.85rem;
            margin-top: 0.25rem;
            display: none; /* Hidden by default */
            height: 1em;
        }

        button[type="submit"] {
            width: 100%;
            padding: 0.85rem;
            background-color: var(--primary-color);
            color: #fff;
            border: none;
            border-radius: 5px;
            font-size: 1.1rem;
            font-weight: 600;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.1s;
        }

        button[type="submit"]:hover {
            background-color: #4E342E;
        }
        
        button[type="submit"]:active {
            transform: scale(0.99);
        }
    </style>
</head>
<body>

    <div class="container">
        <h1>Welcome to Book Haven</h1>
             <form action="signUp" method="post">
                        First Name<input type="text" name="firstName" placeholder="Enter first name"><br>
                        Last Name<input type="text" name="userName" placeholder="Enter user name"><br>
                        DOB<input type="text" name="email" placeholder="email"><br>
                        Email<input type="password" name="password" placeholder="Enter Password"><br>
                        <button type="submit">Register</button>
                    </form>
        </form>
    </div>

    <script>
        document.addEventListener('DOMContentLoaded', () => {
            const form = document.getElementById('registrationForm');

            const fullName = document.getElementById('fullName');
            const username = document.getElementById('username');
            const email = document.getElementById('email');
            const password = document.getElementById('password');

            const fullNameError = document.getElementById('fullNameError');
            const usernameError = document.getElementById('usernameError');
            const emailError = document.getElementById('emailError');
            const passwordError = document.getElementById('passwordError');
            
            form.addEventListener('submit', (e) => {
                e.preventDefault(); // Prevent default form submission
                
                // Reset previous errors
                resetErrors();

                let isValid = true;

                // Validate Full Name
                if (fullName.value.trim().length < 3) {
                    displayError(fullNameError, 'Full name must be at least 3 characters.');
                    isValid = false;
                }

                // Validate Username
                if (username.value.trim().length < 5) {
                    displayError(usernameError, 'Username must be at least 5 characters.');
                    isValid = false;
                }

                // Validate Email
                const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
                if (!emailPattern.test(email.value)) {
                    displayError(emailError, 'Please enter a valid email address.');
                    isValid = false;
                }

                // Validate Password
                if (password.value.length < 8) {
                    displayError(passwordError, 'Password must be at least 8 characters long.');
                    isValid = false;
                }

                if (isValid) {
                    alert('Registration Successful!');
                    console.log('Form Submitted:', {
                        fullName: fullName.value,
                        username: username.value,
                        email: email.value,
                    });
                    // Here you would typically send the data to a server
                    form.reset();
                }
            });

            function displayError(errorElement, message) {
                errorElement.textContent = message;
                errorElement.style.display = 'block';
            }

            function resetErrors() {
                fullNameError.style.display = 'none';
                usernameError.style.display = 'none';
                emailError.style.display = 'none';
                passwordError.style.display = 'none';
            }
        });
    </script>

</body>
</html>