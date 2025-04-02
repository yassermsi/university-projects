package ITCS107.Tutorials;

public class Person {
    private String name;
    private double weight;
    private double height;
    public Person() {
        name = "Unknown";
        weight = 0.0;
        height = 0.0;
    }
    public void setPerson(String n, double w, double h) {
        name = n;
        weight = w;
        height = h;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person();
        people[0].setPerson("John Doe", 85, 1.75);
        people[1] = new Person();
        people[1].setPerson("Jane Smith", 60, 1.65);
        people[2] = new Person();
        people[2].setPerson("Alice Brown", 90, 1.80);
        System.out.println("Overweight people:");
        findOverweightPeople(people);
    }
    public static void findOverweightPeople(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            double BMI = people[i].getWeight() / (people[i].getHeight() * people[i].getHeight());
            if (BMI > 25) 
                System.out.println(people[i].getName());
        }
    }
}
