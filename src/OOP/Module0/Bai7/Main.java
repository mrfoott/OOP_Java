package OOP.Module0.Bai7;

public class Main {
    public static void main(String[] args) {
        Point pt = new Point(5, 5, "O");
        Circle circle = new Circle(pt, 10.5f);

        System.out.println(circle.toString());
    }
}
