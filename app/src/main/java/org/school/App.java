
package org.school;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class App {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Starting tomcat server...");
        ApplicationContext appContext = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");

        Tomcat tomcat = new Tomcat();

        tomcat.getConnector();
        // this is important, Tomcat will look for files in this path
        tomcat.addWebapp("", new File("app/src/main/resources").getAbsolutePath());

        // Start the server and listen
        tomcat.start();
        tomcat.getServer().await();
    }
}
