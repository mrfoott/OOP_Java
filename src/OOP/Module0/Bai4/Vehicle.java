package OOP.Module0.Bai4;

public class Vehicle {
    private String chuXe;
    private String loaiXe;
    private float triGiaXe;
    private int dungTichXyLanh;

    public Vehicle() {
        chuXe = "null";
        loaiXe = "null";
        triGiaXe = 0.0f;
        dungTichXyLanh = 0;
    }

    public Vehicle (String chuXe, String loaiXe, float triGiaXe, int dungTichXyLanh) {
        if (chuXe != "") {
            this.chuXe = chuXe;
        } else {
            this.chuXe = "null";
        }

        if (loaiXe != "") {
            this.loaiXe = loaiXe;
        } else {
            this.loaiXe = "null";
        }

        if (triGiaXe >= 0) {
            this.triGiaXe = triGiaXe;
        } else {
            this.triGiaXe = 0;
        }

        if (dungTichXyLanh >= 0) {
            this.dungTichXyLanh = dungTichXyLanh;
        } else {
            this.dungTichXyLanh = 0;
        }
    }

    public void setChuXe(String chuXe) {
        if (chuXe != "") {
            this.chuXe = chuXe;
        } else {
            this.chuXe = "null";
        }
    }

    public void setLoaiXe(String loaiXe) {
        if (loaiXe != "") {
            this.loaiXe = loaiXe;
        } else {
            this.loaiXe = "null";
        }
    }

    public void setTriGiaXe(float triGiaXe) {
        if (triGiaXe >= 0) {
            this.triGiaXe = triGiaXe;
        } else {
            this.triGiaXe = 0;
        }
    }

    public void setDungTichXyLanh(int dungTichXyLanh) {
        if (dungTichXyLanh >= 0) {
            this.dungTichXyLanh = dungTichXyLanh;
        } else {
            this.dungTichXyLanh = 0;
        }
    }

    public String getChuXe() {
        return chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public float getTriGiaXe() {
        return triGiaXe;
    }

    public float getDungTichXyLanh() {
        return dungTichXyLanh;
    }

    public float tinhThue() {
        if (this.dungTichXyLanh >= 0 && this.dungTichXyLanh < 100) {
            return (this.triGiaXe / 100);
        } else if (this.dungTichXyLanh >= 100 && this.dungTichXyLanh <= 200) {
            return (this.triGiaXe * 3 / 100);
        } else {
            return this.triGiaXe * 5 / 100;
        }
    }

    public String toString() {
        return String.format("%-20s %-20s %10d %18.2f %18.2f", chuXe, loaiXe, dungTichXyLanh, triGiaXe, tinhThue());
    }
}
