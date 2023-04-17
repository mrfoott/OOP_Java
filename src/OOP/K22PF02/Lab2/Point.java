package OOP.K22PF02.Lab2;

public class Point {
    private double x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }



    public double distance(Point pt1) {
        double calX = this.getX() - pt1.getX();
        double calY = this.getY() - pt1.getY();
        double calXY = Math.pow(calX, 2) + Math.pow(calY, 2);
        double distance = Math.sqrt(calXY);

        return distance;
    }
}
