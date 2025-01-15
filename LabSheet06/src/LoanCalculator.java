
public class LoanCalculator {
    private String productName;
    private double price;
    private double interestRate;
    private int years;
 
    
    public void setLoanDetails(String productname, double prices, double interestrate, int year) {
        productName = productname;
        price = prices;
        interestRate = interestrate;
        years = year;
    }
 
    
    public double calculateMonthlyPayment() {
        double monthlyRate = interestRate / 12 / 100;
        int totalMonths = years * 12;
        return (price * monthlyRate * Math.pow(1 + monthlyRate, totalMonths)) /
                (Math.pow(1 + monthlyRate, totalMonths) - 1);
    }
 
    
    public void displayLoanDetails() {
        System.out.println("Loan Details:");
        System.out.println("Product Name: " + productName);
        System.out.println("Loan Amount: " + price);
        System.out.println("Annual Interest Rate: " + interestRate + "%");
        System.out.println("Loan Period (years): " + years);
        System.out.printf("Monthly Payment: %.2f\n", calculateMonthlyPayment());
    }
}