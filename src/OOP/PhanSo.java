package OOP;

public class PhanSo {
    private int TuSo;
    private int MauSo;

    public PhanSo(int TuSo, int MauSo) {
        this.TuSo = TuSo;
        this.MauSo = MauSo;
    }

    public void setTuSo(int tuSo) {
        TuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.MauSo = mauSo;
    }

    public int getTuSo() {
        return TuSo;
    }

    public int getMauSo() {
        return MauSo;
    }

    public void CongPhanSo(PhanSo phanSo) {
        int tuSo = (this.getTuSo()* phanSo.getMauSo()) + (phanSo.getTuSo()* this.getMauSo());
        int mauSo = this.getMauSo()* phanSo.getMauSo();

        PhanSo phanSoMoi = new PhanSo(tuSo, mauSo);

        System.out.println(phanSoMoi.TuSo + "/" + phanSoMoi.MauSo);
    }

    public static void main(String[] args) {
        PhanSo phanSo1= new PhanSo(16,3);
        PhanSo phanSo2= new PhanSo(4,8);

        phanSo1.CongPhanSo(phanSo2);
    }
}
