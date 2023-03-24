package OOP.Module0.Bai1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ToaDo diem1 = new ToaDo(5, 6, "Diem A");
        ToaDo diem2 = new ToaDo(75, 66, "Diem B");
        ToaDo diem3 = new ToaDo(575, 5376, "Diem C");
        ToaDo diem4 = new ToaDo();
        System.out.println(diem1.toString());
        System.out.println(diem2.toString());
        System.out.println(diem3.toString());
        System.out.println(diem4.toString());
    }
}
