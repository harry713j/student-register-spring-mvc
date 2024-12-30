
package org.school;

import org.school.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello there");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Student s = (Student) context.getBean("student");
        System.out.println(s.toString());
    }
}
