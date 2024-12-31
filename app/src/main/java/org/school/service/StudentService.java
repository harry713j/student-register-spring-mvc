package org.school.service;

import org.school.model.Student;
import org.school.repo.StudentRepo;

import java.util.List;

public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student student){
        this.repo.create(student);
    }

    public List<Student> getStudents(){
        return this.repo.findAll();
    }
}
