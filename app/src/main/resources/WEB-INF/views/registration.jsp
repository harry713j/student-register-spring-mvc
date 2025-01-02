<%@ page contentType="text/html" language="java"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Student Registration</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css">
    </head>
    <body>
        <form class="form__card" action="registerStudent" method="post">
            <h2>Register Student</h2>
            <div class="form__content">
                <span class="form__item">
                    <label for="rollNo">Student Roll No</label>
                    <input type="text" id="rollNo" name="rollNo" required/>
                </span>
                <span class="form__item">
                    <label for="firstName">First Name</label>
                    <input type="text" id="firstName" name="firstName" required/>
                </span>
                <span class="form__item">
                     <label for="lastName">Last Name</label>
                     <input type="text" id="lastName" name="lastName" required/>
                </span>
                <span class="form__item">
                     <label for="majorSub">Major Subject</label>
                     <input type="text" id="majorSub" name="majorSubject" required/>
                </span>
                <button type="submit">Register</button>
            </div>
         </form>
    </body>
</html>