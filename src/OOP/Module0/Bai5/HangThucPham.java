package OOP.Module0.Bai5;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private float donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
    private LocalDate homNay = LocalDate.now();

    public HangThucPham() {
        maHang = "null";
        tenHang = "xxx";
        donGia = 0.0f;
        ngaySanXuat = LocalDate.of(2023, 3, 28);
        ngayHetHan = LocalDate.of(2033,3, 28);
    }

    public HangThucPham(String maHang, String tenHang, float donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
        if (!maHang.trim().equals("")) {
            this.maHang = maHang;
        } else {
            throw new Exception("Ma hang khong duoc rong!!!");
        }

        if (!tenHang.trim().equals("")) {
            this.tenHang = tenHang;
        } else {
            throw new Exception("Ten hang khong duoc rong!!!");
        }

        if (donGia >= 0) {
            this.donGia = donGia;
        } else {
            this.donGia = 0f;
        }

        if (ngaySanXuat.isBefore(homNay)) {
            this.ngaySanXuat = ngaySanXuat;
        } else {
            this.ngaySanXuat = homNay;
        }

        if (ngayHetHan.isAfter(ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            this.ngayHetHan = ngaySanXuat;
        }
    }

    public void setMaHang(String maHang) throws Exception {
        if (!maHang.trim().equals("")) {
            this.maHang = maHang;
        } else {
            throw new Exception("Ma hang khong duoc rong!!!");
        }
    }

    public void setTenHang(String tenHang) throws Exception {
        if (!tenHang.trim().equals("")) {
            this.tenHang = tenHang;
        } else {
            throw new Exception("Ten hang khong duoc rong!!!");
        }
    }

    public void setDonGia(float donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        } else {
            this.donGia = 0f;
        }
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat.isBefore(homNay)) {
            this.ngaySanXuat = ngaySanXuat;
        } else {
            this.ngaySanXuat = homNay;
        }
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan.isAfter(ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            this.ngayHetHan = ngaySanXuat;
        }
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public float getDonGia() {
        return donGia;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public boolean hetHan() {
        if (ngayHetHan.isBefore(homNay)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ghiChu = "";
        if (hetHan()) {
            ghiChu = "Hang het han";
        }

        String dg = df.format(donGia);

        if (donGia == 0f) {
            dg = "0,00";
        }

        return String.format("%-15s %-15s %15s %-15s %-15s %-20s", maHang, tenHang, dg, ngaySanXuat.format(dtf), ngayHetHan.format(dtf), ghiChu);
    }
}
