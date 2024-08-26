package org.example;

import java.util.ArrayList;
import java.util.List;

public class Function {

  static class Student {

    String name;
    int score;

    Student(String name, int score) {
      this.name = name;
      this.score = score;
    }
  }

  public List<Student> students;

  public Function() {
    this.students = new ArrayList<>();
  }

  public void studentsAddition(String name, int score) {
    students.add(new Student(name, score));
  }

  public void studentsDelete(String name) {
    boolean studentFound = false;
    for (Student student : students) {
      if (student.name.equals(name)) {
        students.removeIf(studentDelete -> studentDelete.name.equals(name));
        studentFound = true;
        break;
      }
    }
    if (!studentFound) {
      System.out.println("入力された学生情報がありません");
    }
  }

  public void updateScore(String name, int newScore) {
    boolean studentFound = false;
    for (Student student : students) {
      if (student.name.equals(name)) {
        student.score = newScore;
        studentFound = true;
        break;
      }
    }
    if (!studentFound) {
      System.out.println("入力された学生情報がありません");
    }
  }


  public double calculationAverageScore() {
    return students.stream().mapToInt(student -> student.score)
        .average()
        .orElse(0.0);
  }

  public void studentsData() {
    System.out.println("学生一覧:");
    for (Function.Student student : students) {
      System.out.println(student.name + ":" + student.score + "点");
    }
  }


}
