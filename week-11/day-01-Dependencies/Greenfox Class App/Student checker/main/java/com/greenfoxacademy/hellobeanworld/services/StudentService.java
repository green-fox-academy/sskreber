package com.greenfoxacademy.hellobeanworld.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    ArrayList<String> names;
    private static int studentCount = 0;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        studentCount++;
        names.add("Lilla");
        studentCount++;
        names.add("John");
        studentCount++;
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public String checkIfStudentEnrolled(String studentName) {
        String isEnrolledString = "Please enter student name.";
        boolean isEnrolled = names.contains(studentName);
        if (isEnrolled) {
            isEnrolledString = "yes";
        } else {
            isEnrolledString = "no";
        }
        return isEnrolledString;
    }
}

