<%@ page contentType="text/html" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Registered Students</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css">
    </head>
    <body>
        <div class="table__container">
            <h2>All the registered Students</h2>
            <table border="1">
            <tr>
                <th>Roll No</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Major Subject</th>
            </tr>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.rollNo}</td>
                    <td>${student.firstName}</td>
                    <td>${student.lastName}</td>
                    <td>${student.majorSubject}</td>
                </tr>
            </c:forEach>
            </table>
        </div>
    </body>
</html>