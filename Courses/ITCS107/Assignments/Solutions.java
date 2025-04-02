package ITCS107.Assignments;

public class Solutions {
    private int code;
    private String name;
    private int quantity;
    private double sellPrice;
    public Solutions() {
        code = 0;
        name = " ";
        quantity = 0;
        sellPrice = 0.0;
    }
    public double calculatePrice(double sellPrice, int quantity) {
        return sellPrice * quantity;
    }
    public void printSolutions() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Sell Price: " + sellPrice);
    }
    public static void main(String[] args) {
        Solutions s1 = new Solutions();
        s1.printSolutions();
        Solutions s2 = new Solutions();
        System.out.println("Total Price: " + s2.calculatePrice(10.0, 5));
    }
}
