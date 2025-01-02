package org.school.repo;

import org.school.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentRepo {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void create(Student student){
        String query = "INSERT INTO student(rollno, firstname, lastname, majorsubject) VALUES(?, ?, ?, ?)";

        int rows = jdbc.update(query, student.getRollNo(), student.getFirstName(),
                student.getLastName(), student.getMajorSubject());

        System.out.println(rows + " rows affected");
    }

    public List<Student> findAll(){
        String query = "SELECT * FROM student";

        RowMapper<Student> mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setRollNo(rs.getInt("rollno"));
                student.setFirstName(rs.getString("firstname"));
                student.setLastName(rs.getString("lastname"));
                student.setMajorSubject(rs.getString("majorsubject"));
                return student;
            }
        };

        return jdbc.query(query, mapper);
    }
}
