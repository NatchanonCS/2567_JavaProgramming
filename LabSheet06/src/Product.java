
public class Product {
	private String name;
    private double price;
    private double vatRate;
 
    public void setProductDetails(String Name, double Price, double VatRate) {
        name = Name;
        price = Price;
        vatRate = VatRate;
    }
 
    public double calculateTotalPrice() {
        return price + (price * vatRate / 100);
    }
 
    public void displayProductDetails() {
        System.out.println("Product Details:");
        System.out.println("Product Name: " + name);
        System.out.println("Price (before VAT): " + price);
        System.out.println("Price (after VAT): " + calculateTotalPrice());
    }
}


