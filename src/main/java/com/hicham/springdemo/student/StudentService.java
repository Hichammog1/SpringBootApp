package com.hicham.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Hicham",
                        "Arhemt Allah",
                        LocalDate.now(),
                        "arhemtallah.hicham@gmail.com",
                        23
                ),
                new Student(
                        "Achraf",
                        "Mog",
                        LocalDate.now(),
                        "achraf.mog@gmail.com",
                        23
                )
        );
    }
}
