package com.apiproject.springboot.springboot_api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


//Create Methods Here to make Rest Api

@RestController
public class CourseController {
    //URL
    @RequestMapping("/courses")
    public List<Course> retrrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Rob", "Course1"),
                new Course(2, "Rob", "Course2"),
                new Course(3, "Learn AWS", "Course3"),
                new Course(4, "Learn Java", "Course4")
        );
    }

}
