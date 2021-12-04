package com.example.crudspring.controller;

import java.util.List;

import com.example.crudspring.model.Course;
import com.example.crudspring.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {
    
    
    private final CourseRepository courseRepository;

    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll();
    }
}
