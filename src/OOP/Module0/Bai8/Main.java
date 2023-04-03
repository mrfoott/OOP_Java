package OOP.Module0.Bai8;

public class Main {
    public static void main(String[] args) {
        CD cd1 = new CD(123456, "Avicii", 12, 456900);
        CD cd2 = new CD(897231, "West Life", 15, 500000);
        CD cd3 = new CD(564147, "One Direction", 13, 200000);
        CD cd4 = new CD(451621, "Linkin Park", 8, 750000);
        CD cd5 = new CD(784111, "Yiruma", 10, 300000);
        CD cd6 = new CD(675454, "Different Heaven", 9, 250000);

        CD cd7 = new CD(897231, "West Life", 15, 500000);

        try {
            CDList cdList = new CDList(6);
            cdList.addCD(cd1);
            cdList.addCD(cd2);
            cdList.addCD(cd3);
            cdList.addCD(cd4);
            cdList.addCD(cd5);
            cdList.addCD(cd6);

            System.out.println(cdList.toString());
            System.out.println("CD Quantity: " + cdList.cdQuantity());
            System.out.println("Total Price: " + cdList.totalPrice());
            System.out.println();
            System.out.println("=====================\n");
            System.out.println("Sort by decreasing price");
            cdList.sortDecreasingPrice();
            System.out.println(cdList.toString());
            System.out.println("=====================\n");
            System.out.println("Sort by alphabet CD Name");
            cdList.sortIncreasingAlphabeticallyCdName();
            System.out.println(cdList.toString());
            System.out.println("=====================\n");
            cdList.addCD(cd7);
            System.out.println(cdList.toString());
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}
