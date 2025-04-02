import java.util.Scanner;

class Pet {
    private String name;
    private int age;
    private double weight;
    public Pet() {
        name = " ";
        age = 0;
        weight = 0.0;
    }
    public Pet(String name, int age, double weight) {
        this.name = name;
        if (age < 0 || weight < 0) {
            System.out.println("Invalid age or weight");
            System.exit(0);
        }
        else {
            this.age = age;
            this.weight = weight;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
            System.exit(0);
        }
        else 
            this.age = age;
    }
    public void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("Invalid weight");
            System.exit(0);
        }
        else 
            this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " pounds");
    }
}

public class PetDemo {
    public static void main(String[] args) { 
        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter the name, age, and weight of your pet: ");
        String name = kbd.nextLine();
        int age = kbd.nextInt();
        double weight = kbd.nextDouble();
        kbd.close();
        Pet p1 = new Pet(name, age, weight);
        p1.writeOutput();
    }
}