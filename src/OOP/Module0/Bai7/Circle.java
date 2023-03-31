package OOP.Module0.Bai7;

import java.text.DecimalFormat;

public class Circle {
    private Point center;
    private float radius;

    public Circle() {
        center = new Point();
        radius = 0.0f;
    }

    public Circle(Point center, float radius) {
        this.center = center;

        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 0.0f;
        }
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(float radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 0.0f;
        }
    }

    public Point getCenter() {
        return center;
    }

    public float getRadius() {
        return radius;
    }

    public float perimeter() {
        return 2 * radius * (float)Math.PI;
    }

    public float area() {
        return radius * radius * (float) Math.PI;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.000");
        return "Hinh tron co tam " + center.toString() + " voi ban kinh " + radius + " co dien tich va chu vi lan luot la " + df.format(area()) + " va " + df.format(perimeter());
    }
}
