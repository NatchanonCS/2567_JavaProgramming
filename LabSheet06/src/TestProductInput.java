
import java.util.Scanner;
 
public class TestProductInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
 
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
 
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
 
        System.out.print("Enter VAT rate (%): ");
        double vatRate = scanner.nextDouble();
 
        product.setProductDetails(name, price, vatRate);
        product.displayProductDetails();
 
        scanner.close();
    }
}