package com.example.demo.main;

import com.example.demo.bean.Student;
import com.example.demo.bean.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by tghe on 4/12/17.
 */
@Component
@Path("/")
public class StudentApi {
    private StudentRepo studentRepo;
    @Autowired
    public StudentApi(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Path("addStudent")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Student addStudent(Student student) {
        studentRepo.save(student);
        return student;
    }

    @Path("addStudent")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Student addStudent(String id) {
        return studentRepo.findById(id);
    }
}
