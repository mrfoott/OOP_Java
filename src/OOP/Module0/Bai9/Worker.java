package OOP.Module0.Bai9;

public class Worker {
    private int wID;
    private String wFirstName;
    private String wLastName;
    private int wProductQuantity;

    public Worker() {
        wID = 999999;
        wFirstName = "Undefined";
        wLastName = "Undefined";
        wProductQuantity = 0;
    }

    public Worker(int wID, String wFirstName, String wLastName, int wProductQuantity) {
        if (wID > 0) {
            this.wID = wID;
        } else {
            this.wID = 999999;
        }

        if (!wFirstName.trim().equals("")) {
            this.wFirstName = wFirstName;
        } else {
            this.wFirstName = "Undefined";
        }

        if (!wLastName.trim().equals("")) {
            this.wLastName = wLastName;
        } else {
            this.wLastName = "Undefined";
        }

        if (wProductQuantity > 0) {
            this.wProductQuantity = wProductQuantity;
        } else {
            this.wProductQuantity = 0;
        }
    }

    public void setwID(int wID) {
        if (wID > 0) {
            this.wID = wID;
        } else {
            this.wID = 999999;
        }
    }

    public void setwFirstName(String wFirstName) {
        if (!wFirstName.trim().equals("")) {
            this.wFirstName = wFirstName;
        } else {
            this.wFirstName = "Undefined";
        }
    }

    public void setwLastName(String wLastName) {
        if (!wLastName.trim().equals("")) {
            this.wLastName = wLastName;
        } else {
            this.wLastName = "Undefined";
        }
    }

    public void setwProductQuantity(int wProductQuantity) {
        if (wProductQuantity > 0) {
            this.wProductQuantity = wProductQuantity;
        } else {
            this.wProductQuantity = 0;
        }
    }

    public int getwID() {
        return wID;
    }

    public String getwFirstName() {
        return wFirstName;
    }

    public String getwLastName() {
        return wLastName;
    }

    public int getwProductQuantity() {
        return wProductQuantity;
    }

    public float calculateSalary() {
        if (wProductQuantity >= 600) {
            return wProductQuantity * 0.65f;
        } else if (wProductQuantity < 600 && wProductQuantity >= 400) {
            return wProductQuantity * 0.6f;
        } else if (wProductQuantity < 400 && wProductQuantity >= 200) {
            return wProductQuantity * 0.55f;
        } else {
            return wProductQuantity * 0.5f;
        }
    }

    @Override
    public String toString() {
        return String.format("%-10d %-10s %-15s %8d %8.2f", wID, wFirstName, wLastName, wProductQuantity, calculateSalary());
    }
}
