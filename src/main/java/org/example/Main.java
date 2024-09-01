package org.example;

import java.util.Scanner;

public class Main {


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    StudentManager studentManager = new StudentManager();
    int choice = 0;

    while (choice != 6) {
      System.out.println("1. 学生を追加");
      System.out.println("2. 学生を削除");
      System.out.println("3. 点数を更新");
      System.out.println("4. 平均点を計算");
      System.out.println("5. 全学生の情報を表示");
      System.out.println("6. 終了");

      System.out.println("選択してください：");
      choice = scanner.nextInt();
      if (choice == 1) {
        System.out.println("学生の名前を入力してください：");
        String name = scanner.next();
        System.out.println(name + "の点数を入力してください：");
        int score = scanner.nextInt();
        studentManager.addStudent(name, score);
      } else if (choice == 2) {
        if (studentManager.studentList.students.isEmpty()) {
          System.out.println("学生情報が登録されていません");
        } else {
          System.out.println("学生の名前を入力してください：");
          String name = scanner.next();
          studentManager.deleteStudent(name);
        }
      } else if (choice == 3) {
        if (studentManager.studentList.students.isEmpty()) {
          System.out.println("学生情報が登録されていません");
        } else {
          System.out.println("学生の名前を入力してください：");
          String name = scanner.next();
          System.out.println("新しく登録する点数を入力してください：");
          int newScore = scanner.nextInt();
          studentManager.updateScore(name, newScore);
        }
      } else if (choice == 4) {
        if (studentManager.studentList.students.isEmpty()) {
          System.out.println("学生情報が登録されていません");
        } else {
          double averageScore = studentManager.calculateAverageScore();
          System.out.println("平均点：" + averageScore + "点");
        }
      } else if (choice == 5) {
        if (studentManager.studentList.students.isEmpty()) {
          System.out.println("学生情報が登録されていません");
        } else {
          studentManager.displayStudents();
        }
      } else if (choice == 6) {
        System.out.println("プログラムを終了します");
      } else {
        System.out.println("入力された番号のメニューはありません。1〜6の数字を入力してください");
      }

    }


  }
}