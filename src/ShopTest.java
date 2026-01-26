class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop("Lidl", new Product[]{
                new Product("mleko",5.5),
                new Product("jajka", 12.3),
                new Product("mąka", 7.5),
                new Product("cukier", 4)});

        shop.showProducts();
    }
}
