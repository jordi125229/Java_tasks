package product;

class Test {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product("water", Category.FOOD),
                new Product("tv", Category.ELECTRONICS),
                new Product("coat", Category.CLOTHING)
        };

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
