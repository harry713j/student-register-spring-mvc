package org.school.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.school.service.StudentService;

import java.io.IOException;

public class StudentController extends HttpServlet {
    private StudentService service;

    public StudentService getService() {
        return service;
    }

    public void setService(StudentService service) {
        this.service = service;
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("GET Method");
//        req.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(req, res);
        res.setContentType("text/html");
        res.getWriter().println("""
                <html>
                    <head>
                        <title>Student registration</title>
                    </head>
                    <body>
                        <h1>Welcome to Student Registration</h1>
                    </body>
                </html>
                """);
    }

}
