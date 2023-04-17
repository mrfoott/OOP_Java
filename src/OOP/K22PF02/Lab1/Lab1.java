package OOP.K22PF02.Lab1;

import java.util.Scanner;

public class Lab1 {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void printFibNum(int n) {
        int n1 = 0, n2 = 1, counter = 1;

        while (counter < n) {
            System.out.print(n1 + " ");

            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            counter++;
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (n < 2) {
                return false;
            } else if (n % i == 0) {
                return false;
            } else {
                return true;
            }
        }
        return isPrime(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Ex1");
//        int n, m;
//        System.out.println("Enter m: ");
//        m = sc.nextInt();
//        System.out.println("Enter n: ");
//        n = sc.nextInt();
//
//        System.out.println("Numbers divisible by 7");
//
//        for (int i = m; i <= n; i++) {
//            if (i % 7 == 0) {
//                System.out.println(i);
//            }
//        }

//        System.out.println("Ex2");
//        int a, b, n;
//        System.out.println("Enter n: ");
//        n = sc.nextInt();
//        System.out.println("Enter a: ");
//        a = sc.nextInt();
//        System.out.println("Enter b: ");
//        b = sc.nextInt();
//
//        System.out.println("Numbers that divisible by a and b from range 1 to n: ");
//        for (int i = 1; i <= n; i++) {
//            if (a % i == 0 && b % i == 0) {
//                System.out.println(i);
//            }
//        }

//        System.out.println("Ex3");
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//        System.out.println("Nth fibonacci number: ");
//        System.out.println(fibonacci(n));
//
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//        System.out.println("Fibonacci numbers to n: ");
//        printFibNum(n);

        System.out.println("Ex4");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.println();
            }
        }
    }
}
