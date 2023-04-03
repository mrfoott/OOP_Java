package OOP.Module0.Bai8;

public class CD {
    private int cdID;
    private String cdName;
    private int numberOfTracks;
    private float price;

    public void setCdID(int cdID) {
        if (cdID > 0) {
            this.cdID = cdID;
        } else {
            this.cdID = 999999;
        }
    }

    public void setCdName(String cdName) {
        if (!cdName.trim().equals("")) {
            this.cdName = cdName;
        } else {
            this.cdName = "Undefined";
        }
    }

    public void setNumberOfTracks(int numberOfTracks) {
        if (numberOfTracks > 0) {
            this.numberOfTracks = numberOfTracks;
        } else {
            this.numberOfTracks = 0;
        }
    }

    public void setPrice(float price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0f;
        }
    }

    public int getCdID() {
        return cdID;
    }

    public String getCdName() {
        return cdName;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public float getPrice() {
        return price;
    }

    public CD() {
        cdID = 999999;
        cdName = "Undefined";
        numberOfTracks = 0;
        price = 0;
    }

    public CD(int cdID, String cdName, int numberOfTracks, float price) {
        if (cdID > 0) {
            this.cdID = cdID;
        } else {
            this.cdID = 999999;
        }

        if (!cdName.trim().equals("")) {
            this.cdName = cdName;
        } else {
            this.cdName = "Undefined";
        }

        if (numberOfTracks > 0) {
            this.numberOfTracks = numberOfTracks;
        } else {
            this.numberOfTracks = 0;
        }

        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0f;
        }
    }

    @Override
    public String toString() {
        return String.format("%-10d %-20s %10d %12.2f", cdID, cdName, numberOfTracks, price);
    }
}
