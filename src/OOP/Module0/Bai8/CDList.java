package OOP.Module0.Bai8;

import java.util.ArrayList;

public class CDList {
    private ArrayList<CD> cdList = new ArrayList<>();
    private int maximum;

    public CDList(int n) throws Exception {
        if (n > 0) {
            cdList.ensureCapacity(n);
            maximum = n;
        } else {
            throw new Exception("Failed to create CD List!!!");
        }
    }

    public boolean duplicateCdID(CD cd) {
        for (int i = 0; i < cdList.size(); i++) {
            if (cd.getCdID() == cdList.get(i).getCdID()) {
                return true;
            }
        }
        return false;
    }

    public boolean addCD(CD cd) {
        if ((cdList.size() == maximum) || duplicateCdID(cd)) {
            return false;
        } else {
            cdList.add(cd);
            return true;
        }
    }

    public int cdQuantity() {
        return cdList.size();
    }

    public float totalPrice() {
        float totalPrice = 0.0f;

        for (int i = 0; i < cdList.size(); i++) {
            totalPrice += cdList.get(i).getPrice();
        }

        return totalPrice;
    }

    @Override
    public String toString() {
        String totalInfo = "";

        for (int i = 0; i < cdList.size(); i++) {
            totalInfo += cdList.get(i).toString() + "\n";
        }

        return totalInfo;
    }

    public void sortDecreasingPrice() {
        cdList.sort((s1, s2) -> {
            if (s1.getPrice() > s2.getPrice()) {
                return -1;
            } else {
                return 1;
            }
        });
    }

    public void sortIncreasingAlphabeticallyCdName() {
        cdList.sort((s1, s2) -> {
            return s1.getCdName().compareTo(s2.getCdName());
        });
    }
}
