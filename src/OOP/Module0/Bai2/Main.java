package OOP.Module0.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student(1, "Vo Hong Phu", 10.0f, 10.0f);
        Student student2 = new Student(2, "Le Minh Hoang Nhat", 10.0f, 10.0f);
        Student student3 = new Student();
        System.out.println("Nhap thong tin sinh vien");
        System.out.print("MSSV: ");
        int MSV = sc.nextInt();
        sc.nextLine();
        System.out.print("Ho ten SV: ");
        String hoTen = sc.nextLine();
        System.out.print("Diem LT: ");
        float diemLT = sc.nextFloat();
        System.out.print("Diem TH: ");
        float diemTH = sc.nextFloat();

        student3.setMSV(MSV);
        student3.setHoTen(hoTen);
        student3.setDiemLT(diemLT);
        student3.setDiemTH(diemTH);

        System.out.printf("%-10s %-30s %10s %10s %10s\n", "MSSV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println("==========================================================================");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
