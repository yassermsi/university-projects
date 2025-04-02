class CarInsurancePolicy {
    private int policyNumber = 0;
    private int numPayments = 2;
    private String residentCity = "Manama";
    public CarInsurancePolicy(int policyNumber, int numPayments, String residentCity) {
        if (policyNumber < 0 || numPayments < 0) {
            System.out.println("Invalid policy number or number of payments");
            System.exit(0);
        }
        else {
            this.policyNumber = policyNumber;
            this.numPayments = numPayments;
        }
        this.residentCity = residentCity;
    }
    public CarInsurancePolicy(int policyNumber, int numPayments){
        residentCity = "Manama";
        if (policyNumber < 0 || numPayments < 0) {
            System.out.println("Invalid policy number or number of payments");
            System.exit(0);
        }
        else {
            this.policyNumber = policyNumber;
            this.numPayments = numPayments;
        }
    }
    public CarInsurancePolicy(int policyNumber){
        residentCity = "Manama";
        numPayments = 2;
        if (policyNumber < 0) {
            System.out.println("Invalid policy number");
            System.exit(0);
        }
        else {
            this.policyNumber = policyNumber;
        }
    }
    public void display() {
        System.out.println("Car Insurance Policy data follows:");
        System.out.println("Policy Number is: " + policyNumber);
        System.out.println("Policy Number of Payments is: " + numPayments);
        System.out.println("City of residence is: " + residentCity);
    }
}

public class CarInsuranceDemo {
    public static void main(String[] args) {
        CarInsurancePolicy p1 = new CarInsurancePolicy(123);
        p1.display();
        CarInsurancePolicy p2 = new CarInsurancePolicy(456,     4);
        p2.display();
        CarInsurancePolicy p3 = new CarInsurancePolicy(789, 2, "Muhharraq");
        p3.display();
    }
}
