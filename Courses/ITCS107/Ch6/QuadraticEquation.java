public class QuadraticEquation {
    private int a;
    private int b;
    private int c;
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getDiscriminant() {
        return (b * b) - (4 * a * c);
    }
    public double getRoot1() {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public double getRoot2() {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public static void main(String[] args) {
        QuadraticEquation q1 = new QuadraticEquation(1, -3, 2);
        if (q1.getDiscriminant() > 0)
            System.out.println("Roots are: " + q1.getRoot1() + " and " + q1.getRoot2());
        else if (q1.getDiscriminant() == 0) 
            System.out.println("One root is: " + q1.getRoot1());
        else 
            System.out.println("The equation has no roots.");
    }
}