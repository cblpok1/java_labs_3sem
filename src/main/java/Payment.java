import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Product> products = new ArrayList<>();



    public class Product{
        private String name;
        private double price;

        public Product(String name,double price){
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
    public void addProduct(String name,double price){
        products.add(new Product(name,price));
    }

    public double getTotalPrice(){
        double total = 0;
        for(Product p : products){
            total+=p.getPrice();
        }
        return total;
    }

    public double calculateDiscount(double discountPercent){
        Discount discount = new Discount(){
            @Override
            public double apply(double price){
                return price * (1-discountPercent/100);
            }
        };
        return discount.apply(getTotalPrice());
    }
    public void printReceipt(){
        for(Product p:products){
            System.out.println(p.getName()+" : "+p.getPrice());
        }
        System.out.println("Summary: "+getTotalPrice());
    }
}
