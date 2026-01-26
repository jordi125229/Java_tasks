class Shop {
    String name;
    Product[] products = new Product[20];

    public Shop(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public void showProducts(){
        for (Product product : products) {
            System.out.println(product.name + " " + product.price);
        }
    }
}
