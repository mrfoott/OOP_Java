package Baitapchuong0_01;

import java.util.Scanner;

public class Main {
    public static void demTien(int soTien) {
        int[] menhGia = new int[]{ 500000, 200000, 100000, 50000, 20000, 10000, 5000, 2000, 1000 };
        int[] soToMoiMenhGia = new int[9];

        for (int i = 0; i < 9; i++) {
            if (soTien >= menhGia[i]) {
                soToMoiMenhGia[i] = soTien/menhGia[i];
                soTien = soTien % menhGia[i];
            }
        }

        System.out.println("So to tien moi menh gia:");
        for (int i = 0; i < 9; i++) {
            if (soToMoiMenhGia[i] >= 0) {
                System.out.println(menhGia[i] + " VND: " + soToMoiMenhGia[i] + " to");
            }
        }
    }

    public static void countCurrency(int sumMoney) {
        int[] notes = new int[] { 100, 50, 20, 10, 5, 2, 1 };
        int[] numberOfEachNote = new int[7];

        for (int i = 0; i < 7; i++) {
            if (sumMoney >= notes[i]) {
                numberOfEachNote[i] = sumMoney / notes[i];
                sumMoney = sumMoney % notes[i];
            }
        }

        for (int i = 0; i < 7; i++) {
            if (numberOfEachNote[i] >= 0) {
                System.out.println(notes[i] + " $ note: " + numberOfEachNote[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Bai 1
//        System.out.println("Bai 1");
//        System.out.println("Day la chuong trinh C++ nha");
//        System.out.println("Mon hoc       Diem");
//        System.out.println("Toan roi rac  9");
//        System.out.println("LTCB          8");
//        System.out.println("Triet hoc     7.5");

//        Bai 2
//        System.out.println("Chuong trinh doi do F sang do C");
//
//        System.out.println("Nhap do F:");
//        int doF = sc.nextInt();
//
//        float doC = 5 * (doF - 32)/9;
//        System.out.println("Nhiet do Celcius tuong ung:");
//        System.out.println(doC);

//        Bai 3
//        System.out.println("Xuat gia tri ASCII cua ki tu");
//        char chara = 'a';
//        int valueOfChar = chara;
//        System.out.println(valueOfChar);

//        Bai 4
//        System.out.println("Hoan doi gia tri 2 bien");
//        System.out.println("Nhap gia tri so a: ");
//        int num1 = sc.nextInt();
//        System.out.println("Nhap gia tri so b: ");
//        int num2 = sc.nextInt();
//        int temp = num2;
//        num2 = num1;
//        num1 = temp;
//        System.out.println("Gia tri sau khi hoan doi:");
//        System.out.println("So a:");
//        System.out.println(num1);
//        System.out.println("So b:");
//        System.out.println(num2);

//        Bai 5
//        System.out.println("So chan hay so le?");
//        System.out.println("Nhap vao 1 so: ");
//        int num = sc.nextInt();
//
//        if (num % 2 == 0 && num != 0) {
//            System.out.println("So chan");
//        } else {
//            System.out.println("So le");
//        }

//        Bai 6
//        System.out.println("Hoan doi gia tri 2 so!");
//        System.out.println("Nhap so thu nhat: ");
//        int num1 = sc.nextInt();
//        System.out.println("Nhap so thu hai: ");
//        int num2 = sc.nextInt();
//
//        int sum = num1 + num2;
//
//        System.out.println("Gia tri sau khi da hoan doi");
//        System.out.println("So thu nhat: " + (sum - num1));
//        System.out.println("So thu hai: " + (sum -num2));

//        Bai 7
//        System.out.println("Enter total amount of money:");
//        int sumMoney = sc.nextInt();
//        countCurrency(sumMoney);

//        Bai 8
//        final int feetToInch = 12;
//        final double inchToCentimeter = 2.54f;
//
//        System.out.println("Enter feet amount of first parameter:");
//        double feetOfFirstParameter = sc.nextDouble();
//        System.out.println("Feet to inch of first parameter:");
//        double feetToInchOfFirstNumber = feetOfFirstParameter * feetToInch;
//        System.out.println(feetToInchOfFirstNumber + " inch");
//        System.out.println("Inch to centimeter of first parameter:");
//        double inchToCentimeterOfFirstParameter = feetToInchOfFirstNumber * inchToCentimeter;
//        System.out.println(inchToCentimeterOfFirstParameter + " centimeter");
//
//        System.out.println("Enter inch amount");
//        double inchOfSecondParameter = sc.nextDouble();
//        double inchToCentimeterOfSecondParameter = inchOfSecondParameter * inchToCentimeter;
//        System.out.println("Inch to centimeter of second parameter:");
//        System.out.println(inchToCentimeterOfSecondParameter + " centimeter");

//        Bai 9
//        System.out.println("Biggest number");
//        System.out.println("Nhap so a:");
//        int a = sc.nextInt();
//        System.out.println("Nhap so b:");
//        int b = sc.nextInt();
//        System.out.println("Nhap so c:");
//        int c = sc.nextInt();
//
//        if (a >= b && a >= c) {
//            System.out.println("So lon nhat la so a");
//        } else if (b >= a && b >= c) {
//            System.out.println("So lon nhat la so b");
//        } else {
//            System.out.println("So lon nhat la so c");
//        }

//        Bai 10
        System.out.println("Nhap toa do diem thu nhat:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Nhap toa do diem thu hai:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Toa do diem thu nhat: (" + x1 + ", " + y1 + ")");
        System.out.println("Toa do diem thu hai: (" + x2 + ", " + y2 + ")");
        System.out.println("Toa do trung diem cua (" + x1 + ", " + y1 + ") va (" + x2 + ", " + y2 + ") la: (" +
                ((x1 + x2)/2) + ", " + ((y1 + y2)/2) + ")");
    }
}
