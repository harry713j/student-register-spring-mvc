package org.school.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.school.model.Student;
import org.school.service.StudentService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.IOException;
import java.util.List;

public class ShowDetailsController extends HttpServlet {
    private StudentService service;

    @Override
    public void init() throws ServletException{
        super.init();
        WebApplicationContext springContext = WebApplicationContextUtils
                .getRequiredWebApplicationContext(this.getServletContext());
        this.service = springContext.getBean("studentService",StudentService.class);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("GET method Show Details");
        List<Student> students = service.getStudents();

        req.setAttribute("students", students);

        req.getRequestDispatcher("/WEB-INF/views/showStudents.jsp").forward(req, res);
    }
}
