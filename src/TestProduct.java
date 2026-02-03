class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product("sok", 5.5);
        Product p2 = new Product("mieso", 13);
        Product p3 = new Product("cukier", 4.3);

        p1.showProduct();
        p2.showProduct();
        p3.showProduct();

        //19
        double newPrice = p1.reducePrice(3.0);
        System.out.println("New price: " + newPrice);

        double sale = p2.reducePrice(4.0, "sale");
        System.out.println(sale);
    }
}
