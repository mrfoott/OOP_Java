package OOP.Module0.Bai2;

public class Student {
    private int MSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public Student() {
        MSV = 0;
        hoTen = "Null";
        diemLT = 0.0f;
        diemTH = 0.0f;
    }

    public Student(int MSV, String hoTen, float diemLT, float diemTH) {
        if (MSV > 0) {
            this.MSV = MSV;
        } else {
            this.MSV = 0;
        }

        if (!hoTen.equals("")) {
            this.hoTen = hoTen;
        } else {
            this.hoTen = "Null";
        }

        if (diemLT >= 0.0 && diemLT <= 10.0) {
            this.diemLT = diemLT;
        } else {
            this.diemLT = 0.0f;
        }

        if (diemTH >= 0.0 && diemTH <= 10.0) {
            this.diemTH = diemTH;
        } else {
            this.diemTH = 0.0f;
        }
    }

    public int getMSV() {
        return MSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setMSV(int MSV) {
        if (MSV > 0) {
            this.MSV = MSV;
        } else {
            this.MSV = 0;
        }
    }

    public void setHoTen(String hoTen) {
        if (!hoTen.equals("")) {
            this.hoTen = hoTen;
        } else {
            this.hoTen = "Null";
        }
    }

    public void setDiemLT(float diemLT) {
        if (diemLT >= 0.0 && diemLT <= 10.0) {
            this.diemLT = diemLT;
        } else {
            this.diemLT = 0.0f;
        }
    }

    public void setDiemTH(float diemTH) {
        if (diemTH >= 0.0 && diemLT <= 10.0) {
            this.diemTH = diemTH;
        } else {
            this.diemTH = 0.0f;
        }
    }

    public float diemTB() {
        return (diemLT + diemTH) / 2;
    }

    public String toString() {
        return String.format("%-10s %-30s %10.2f %10.2f %10.2f", MSV, hoTen, diemLT, diemTH, diemTB());
    }
}
