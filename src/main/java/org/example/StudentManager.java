package org.example;

public class StudentManager {

  StudentList studentList = new StudentList();

  public void addStudent(String name, int score) {
    studentList.students.add(new Student(name, score));
  }

  public void deleteStudent(String name) {
    boolean studentFound = false;
    for (Student student : studentList.students) {
      if (student.name.equals(name)) {
        studentList.students.removeIf(studentDelete -> studentDelete.name.equals(name));
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
    for (Student student : studentList.students) {
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


  public double calculateAverageScore() {
    return studentList.students.stream().mapToInt(student -> student.score)
        .average()
        .orElse(0.0);
  }

  public void displayStudents() {
    System.out.println("学生一覧:");
    for (Student student : studentList.students) {
      System.out.println(student.name + ":" + student.score + "点");
    }
  }


}
