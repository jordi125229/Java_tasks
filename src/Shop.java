class Shop {
    private String name;
    private Product[] products = new Product[20];

    public Shop(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public void showProducts(){
        for (Product product : products) {
            System.out.println(product.getName() + " " + product.getPrice());
        }
    }
}
