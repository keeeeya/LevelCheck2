package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {

  String name;
  int score;

  Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public List<Student> studentList;

  public Student() {
    this.studentList = new ArrayList<>();
  }

}
