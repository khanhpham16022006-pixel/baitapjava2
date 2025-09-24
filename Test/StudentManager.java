package Test;

import java.util.*;

public class StudentManager {
    private List<Student> students;

    // Constructor
    public StudentManager() {
        this.students = new ArrayList<>();
    }

    // Phương thức nhập danh sách sinh viên
    public void inputStudents(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Entering information for student " + (i + 1));
            Student student = new Student();
            student.input();
            student.calAverage();
            students.add(student);
        }
    }
 
    // Phương thức hiển thị danh sách sinh viên
    public void displayStudents() {
        for (Student student : students) {
            student.output();
            System.out.println("-----------------------------");
        }
    }

    // Phương thức sắp xếp sinh viên theo điểm trung bình giảm dần
    public void sortStudents() {
        students.sort((s1, s2) -> Double.compare(s2.getAverageScore(), s1.getAverageScore()));
    }

    // Phương thức kiểm tra giá trị nhập vào cho điểm trung bình x
    public double inputAverageThreshold() {
        Scanner sc = new Scanner(System.in);
        double x;
        while (true) {
            System.out.print("Enter the average score threshold (0 - 10): ");
            x = sc.nextDouble();
            if (x >= 0 && x <= 10) {
                break; // Nếu giá trị hợp lệ, thoát khỏi vòng lặp
            } else {
                System.out.println("Invalid threshold! Please enter a value between 0 and 10.");
            }
        }
        return x;
    }

    // Phương thức đếm số lượng sinh viên có điểm trung bình >= x
    public void countAboveAverage(double x) {
        long count = students.stream().filter(s -> s.getAverageScore() >= x).count();
        System.out.println("Number of students with average score >= " + x + ": " + count);
    }
}