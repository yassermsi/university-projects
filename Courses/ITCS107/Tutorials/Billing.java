package ITCS107.Tutorials;

public class Billing {
    public double computeBill(double price) {
        return price * 1.08;
    }
    public double computeBill(double price, int quantity) {
        return price * quantity * 1.08;
    }
    public double computeBill(double price, int quantity, double coupon) {
        return (price * quantity - coupon) * 1.08;
    }
    public static void main(String[] args) {
        Billing bill = new Billing();
        System.out.println("Bill for one item: " + bill.computeBill(10.0));
        System.out.println("Bill for two items: " + bill.computeBill(10.0, 2));
        System.out.println("Bill for two items with coupon: " + bill.computeBill(10.0, 2, 5.0));
    }
}
