
package org.school;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.school.controller.StudentController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class App {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Starting tomcat server...");
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");

        Tomcat tomcat = new Tomcat();

        tomcat.getConnector();

        Context context = tomcat.addContext("", new File(".")
                .getAbsolutePath()); // default dir & no dir to create
        Tomcat.addServlet(context, "studentServlet", new StudentController());
        context.addServletMappingDecoded("/", "studentServlet"); // 1st param for url

        // Start the server and listen
        tomcat.start();
        tomcat.getServer().await();
    }
}
