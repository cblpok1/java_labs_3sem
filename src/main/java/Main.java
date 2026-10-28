public class Main {
    public static void main(String[] args){
        Payment payment = new Payment();

        payment.addProduct("Bread", 1.0);
        payment.addProduct("Milk",10.0);
        payment.addProduct("Cheese",20.0);
        payment.calculateDiscount(10);
        payment.printReceipt();

    }
}
