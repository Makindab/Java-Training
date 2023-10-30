class ShopPrices2 {
    public static void main(String[] args) {
        var item1 = new ShopItem("Cellphone", 2500, 0.25, 8);
        var item2 = new ShopItem("Chocolate bar", 25, 0.25, 37);

        System.out.println("Item 1: " + item1.toString());
        System.out.println("Item 2: " + item2.toString());

        System.out.print("Applying 10% inflation to net prices... ");
        item1.inflateNetPrice(10);
        item2.inflateNetPrice(10);
        System.out.println("Done.");

        System.out.println("Item 1: " + item1.toString());
        System.out.println("Item 2: " + item2.toString());
    }
}

class ShopItem {
    public String name;
    public double netPrice;
    public double vat;
    public int availability;

    public ShopItem(String name, double netPrice, double vat, int avail) {
        this.name = name;
        this.netPrice = netPrice;
        this.vat = vat;
        this.availability = avail;
    }

    public String toString() {
        var str = this.name + " (price: " + this.netPrice + " DKK + "
                    + (this.vat * 100) + "% VAT; "
                    + "availability: " + this.availability + ")";
        return str;
    }

    public void inflateNetPrice(double percentage) {
        this.netPrice = this.netPrice + (this.netPrice * (percentage / 100.0));
    }
}