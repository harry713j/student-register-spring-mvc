<%@ page contentType="text/html" language="java"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Student Detail</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css">
    </head>
    <body>
        <div class="form__card student-detail-card">
            <h2>Student Detail Registered Successfully!</h2>
            <p>Roll No: ${student.rollNo} </p>
            <p>First Name: ${student.firstName} </p>
            <p>Last Name: ${student.lastName} </p>
            <p>Major Subject: ${student.majorSubject} </p>
        </div>
    </body>
</html>