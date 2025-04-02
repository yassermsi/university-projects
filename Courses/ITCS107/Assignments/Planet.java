package ITCS107.Assignments;

public class Planet {
    private String name;
    private double mass; // in kg
    private double radius; // in meters
    public Planet() {
        name = "Unknown";
        mass = 0.0;
        radius = 0.0;
    }
    public Planet(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }
    public String getName() {
        return name;
    }
    public double getMass() {
        return mass;
    }
    public double getRadius() {
        return radius;
    }
    public static void findSmallestPlanet(Planet[] planets) {
        int index = 0;
        for (int i = 1; i < planets.length; i++) {
            if (planets[i].getRadius() < planets[index].getRadius()) 
                index = i;
        }
        System.out.println(planets[index].getName() + "\n" + planets[index].getMass() + "\n" +planets[index].getRadius() + "\n");
    }
    public static void main(String[] args) {
        Planet[] planets = new Planet[3];
        planets[0] = new Planet("Mercury", 3.285e23, 2.4397e6);
        planets[1] = new Planet("Venus", 4.867e24, 6.0518e6);
        planets[2] = new Planet("Earth", 5.972e24, 6.3710e6);
        System.out.println("Smallest planet:");
        findSmallestPlanet(planets);
    }
}