package OOP.Module0.Bai4;

public class Main {
    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle("Vo Hong Phu", "Future FI 2018", 33000000, 125 );
        Vehicle xe2 = new Vehicle("Le Minh Hoang Nhat", "Future FI 2069", 370000000,125);
        Vehicle xe3 = new Vehicle("Nguyen Van Teo", "Yamaha Nouvo", 696969696, 6969);
        System.out.printf("%-20s %-20s %10s %18s %18s", "Ten Chu Xe", "Loai Xe", "Dung Tich", "Gia Tien", "Thue phai tra");
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println(xe1.toString());
        System.out.println(xe2.toString());
        System.out.println(xe3.toString());
    }
}
