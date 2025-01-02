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

public class StudentController extends HttpServlet {
    private StudentService service;

    @Override
    public void init() throws ServletException {
        super.init();
        WebApplicationContext springContext = WebApplicationContextUtils
                .getRequiredWebApplicationContext(this.getServletContext());
        this.service = springContext.getBean(StudentService.class);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("GET method Student");
        req.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("POST method Student");

        int rollNo = Integer.parseInt(req.getParameter("rollNo"));
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String majorSubject = req.getParameter("majorSubject");

        Student student = new Student();
        student.setRollNo(rollNo);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setMajorSubject(majorSubject);

        service.addStudent(student);

        // send the student obj to jsp
        req.setAttribute("student", student);

        req.getRequestDispatcher("/WEB-INF/views/studentDetail.jsp").forward(req, res);
    }
}
