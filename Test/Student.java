/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.util.Scanner;

public class Student {
    private String fullName;
    private String studentClass;
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;
    private double averageScore;

    // Constructor
    public Student() {
        this.fullName = "";
        this.studentClass = "";
        this.mathScore = 0;
        this.physicsScore = 0;
        this.chemistryScore = 0;
        this.averageScore = 0;
    }

    // Phương thức kiểm tra giá trị hợp lệ cho điểm số
    private double inputScore(String subject) {
        Scanner sc = new Scanner(System.in);
        double score;
        while (true) {
            System.out.print("Enter " + subject + " score (0 - 10): ");
            score = sc.nextDouble();
            if (score >= 0 && score <= 10) {
                break; // Nếu điểm hợp lệ, thoát khỏi vòng lặp
            } else {
                System.out.println("Invalid score! Please enter a score between 0 and 10.");
            }
        }
        return score;
    }

    // Phương thức nhập thông tin sinh viên
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        this.fullName = sc.nextLine();
        
        System.out.print("Enter class: ");
        this.studentClass = sc.nextLine();

        this.mathScore = inputScore("Math");
        this.physicsScore = inputScore("Physics");
        this.chemistryScore = inputScore("Chemistry");
    }

    // Phương thức tính điểm trung bình
    public void calAverage() {
        this.averageScore = (this.mathScore + this.physicsScore + this.chemistryScore) / 3;
    }

    // Phương thức hiển thị thông tin sinh viên
    public void output() {
        System.out.println("Name: " + this.fullName + ", Class: " + this.studentClass);
        System.out.println("Math: " + this.mathScore + ", Physics: " + this.physicsScore + ", Chemistry: " + this.chemistryScore);
        System.out.printf("Average Score: %.2f\n", this.averageScore);
    }

    // Getter để lấy điểm trung bình
    public double getAverageScore() {
        return this.averageScore;
    }
}