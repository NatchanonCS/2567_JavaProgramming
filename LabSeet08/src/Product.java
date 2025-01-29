
public class Product {
	
	private String  productId;
	private int  productUnit;
	private double  productPrice;
	
	 public void setId(String pid) {
	        this.productId = pid;
	    }
	    public String getId() {
	        return this.productId;
	    }
	    public void setUnit(int unit) {
	        this.productUnit = unit;
	    }
	    public int getUnit() {
	        return this.productUnit;
	    }
	    public void setPrice(double price) {
	        this.productPrice = price;
	    }
	    public double getPrice() {
	        return this.productPrice;
	    }
	    public double calculate() {
	        return this.productUnit * this.productPrice;
	    }
}
