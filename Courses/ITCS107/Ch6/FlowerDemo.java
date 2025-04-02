import java.util.Scanner;

class Flower {
    private String name = "Rose";
    private double price = 0.0;
    private static int numberOfFlowers = 0;
    public Flower() {
        name = "Rose";
        price = 0.0;
        numberOfFlowers++;
    }
    public Flower(String name, double price) {
        this.name = name;
        this.price = price;
        numberOfFlowers++;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid price");
            System.exit(0);
        }
        else {
            this.price = price;
        }
    }
    public double getPrice() {
        return price;
    }
    public void print() {
        System.out.println("Flower name: " + name);
        System.out.println("Flower price: " + price);
    }
    public static void setNumberOfFlowers(int number) {
        numberOfFlowers = number;
    }
    public static int getNumberOfFlowers() {
        return numberOfFlowers;
    }
}

public class FlowerDemo {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Flower flower1 = new Flower();
        System.out.println("Flower 1 details:");
        flower1.print();
        System.out.println("Enter name and price for flower 1:");
        String name1 = kbd.nextLine();
        double price1 = kbd.nextDouble();
        flower1.setName(name1);
        flower1.setPrice(price1);
        Flower flower2 = new Flower();
        System.out.println("Flower 2 details:");
        flower2.print();
        System.out.println("Enter name and price for flower 2:");
        String name2 = kbd.nextLine();
        double price2 = kbd.nextDouble();
        flower2.setName(name2);
        flower2.setPrice(price2);
        System.out.println("Number of flowers: " + Flower.getNumberOfFlowers());
        kbd.close();
    }
}
