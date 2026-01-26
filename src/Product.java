class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showProduct(){
        System.out.println(name + "; " + price);
    }

    public double reducePrice(Double amount){
        return price - amount;
    }

    public double reducePrice(Double amount, String reason){
        System.out.print(reason + "; new price: ");
        return price - amount;
    }

}
