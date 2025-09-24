package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo đối tượng StudentManager
        StudentManager manager = new StudentManager();

        // Kiểm tra giá trị nhập vào cho số lượng sinh viên
        int n;
        while (true) {
            System.out.print("Enter the number of students: ");
            n = sc.nextInt();
            if (n > 0) {
                break; // Nếu số lượng hợp lệ, thoát khỏi vòng lặp
            } else {
                System.out.println("Invalid number! Please enter a positive number.");
            }
        }

        // Nhập thông tin sinh viên
        manager.inputStudents(n);

        // Hiển thị danh sách sinh viên
        System.out.println("\nList of Students:");
        manager.displayStudents();

        // Sắp xếp và hiển thị sinh viên theo điểm trung bình
        manager.sortStudents();
        System.out.println("\nSorted List of Students (by average score):");
        manager.displayStudents();

        // Kiểm tra giá trị nhập vào cho điểm trung bình x
        double x = manager.inputAverageThreshold();

        // Đếm sinh viên có điểm trung bình >= x
        manager.countAboveAverage(x);
    }
}