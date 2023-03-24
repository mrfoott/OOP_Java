package OOP.Module0.Bai1;

public class ToaDo {
    private int toaDoX;
    private int toaDoY;
    private String tenToaDo;

    public int getToaDoX() {
        return toaDoX;
    }

    public int getToaDoY() {
        return toaDoY;
    }

    public String getTenToaDo() {
        return tenToaDo;
    }

    public void setToaDoX(int toaDoX) {
        this.toaDoX = toaDoX;
    }

    public void setToaDoY(int toaDoY) {
        this.toaDoY = toaDoY;
    }

    public void setTenToaDo(String tenToaDo) {
        this.tenToaDo = tenToaDo;
    }

    public ToaDo() {
        toaDoX = 0;
        toaDoY = 0;
        tenToaDo = "Toa do goc";
    }

    public ToaDo(int toaDoX, int toaDoY, String tenToaDo) {
        this.toaDoX = toaDoX;
        this.toaDoY = toaDoY;
        this.tenToaDo = tenToaDo;
    }

    public String toString() {
        return String.format("%s (%d, %d)", tenToaDo, toaDoX, toaDoY);
    }
}
