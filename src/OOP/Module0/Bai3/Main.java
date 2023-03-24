package OOP.Module0.Bai3;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(1, 4, 1);
        Triangle triangle2 = new Triangle(-3, 5, 1);
        Triangle triangle3 = new Triangle(2, 3, 4);
        Triangle triangle4 = new Triangle(4, 4, 3);
        Triangle triangle5 = new Triangle(7, 7, 7);

        System.out.printf("%-10s %-10s %-10s %-20s %10s %10s\n", "CanhA", "CanhB", "CanhC", "Kieu Tam Giac", "CV", "DT");
        System.out.println(triangle1.toString());
        System.out.println(triangle2.toString());
        System.out.println(triangle3.toString());
        System.out.println(triangle4.toString());
        System.out.println(triangle5.toString());
    }
}
