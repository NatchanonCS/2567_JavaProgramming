import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	       
        Product[] productList = new Product[4]; 
        for (int i = 0; i < productList.length; i++) {
            productList[i] = new Product(); // สร้าง object ใน array
            System.out.print("Input product Id    : ");
            productList[i].setId(scanner.next());
            System.out.print("Input product Unit  : ");
            productList[i].setUnit(scanner.nextInt());
            System.out.print("Input product Price : ");
            productList[i].setPrice(scanner.nextDouble());
            System.out.println();
            
        }
        System.out.print("------------------------------------------------------------------\n");
        double totalPrice = 0;
        for (int i = 0; i < productList.length; i++) {
            double productTotal = productList[i].calculate();
            System.out.println("Product ID : " + productList[i].getId() + ", Total price = " + productTotal + " baht.");
            totalPrice += productTotal;
        }
        System.out.print("------------------------------------------------------------------\n");
        System.out.println("Total price of all products is " + totalPrice + " baht.");
        scanner.close();
    }
}
