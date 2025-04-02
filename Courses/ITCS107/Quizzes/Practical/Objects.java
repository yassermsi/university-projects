package ITCS107.Quizzes.Practical;
import java.util.Scanner;

public class Objects {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        double[] massesInKg = {3.0, 5.0, 20.0, 15.0};
        System.out.println("Enter the gravitational acceleration (in m/s^2):");
        double g = kbd.nextDouble();
        for (double mass : massesInKg) {
            double force = mass * g;
            if (force > 50) 
                System.out.println("For a mass of " + mass + " kg, the force is " + force + " newtons.");
        }
    }
}
