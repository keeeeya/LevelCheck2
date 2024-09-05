package org.example;

public class StudentManager {

  Student student = new Student();

  public void add(String name, int score) {
    student.studentList.add(new Student(name, score));
  }

  public void delete(String name) {
    boolean studentFound = false;
    for (Student students : student.studentList) {
      if (students.name.equals(name)) {
        student.studentList.removeIf(studentDelete -> studentDelete.name.equals(name));
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
    for (Student student : student.studentList) {
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
    return student.studentList.stream().mapToInt(student -> student.score)
        .average()
        .orElse(0.0);
  }

  public void display() {
    System.out.println("学生一覧:");
    for (Student student : student.studentList) {
      System.out.println(student.name + ":" + student.score + "点");
    }
  }


}
