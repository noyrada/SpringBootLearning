package com.project.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    @GetMapping
    public String getDataTeacher(
            @RequestParam Long id,
            @RequestParam String name,
            @RequestParam String subject
    ){
        return "Teacher id:"+id+"name:"+name+ "subject:"+ subject;
    }

    @GetMapping("/two")
    public String getDataTeacherTwo(
            @RequestParam("id") Long teacherId,
            @RequestParam("name") String teacherName,
            @RequestParam("subject") String teacherSubject
    ){
        return "Teacher id: "+teacherId+" name: "+teacherName+ " subject: "+ teacherSubject;
    }

    @GetMapping("/three")
    public String getDataTeacherThree(
            @RequestParam(value = "id",required = false) Long teacherId,
            @RequestParam("name") String teacherName,
            @RequestParam("subject") String teacherSubject
    ){
        return "Teacher id: "+teacherId+" name: "+teacherName+ " subject: "+ teacherSubject;
    }

    @GetMapping("/four")
    public String getDataTeacherFour(
            @RequestParam(value = "id",required = false) Optional<Long> teacherId,
            @RequestParam("name") String teacherName,
            @RequestParam("subject") String teacherSubject
    ){
        long getTeacherId = teacherId.orElse((long) Math.floor(Math.random() * 10000));
        return "Teacher id: "+getTeacherId+" name: "+teacherName+ " subject: "+ teacherSubject;
    }
}
