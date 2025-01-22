
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	Car() {
		companyName = "Unknown";
		modelName = "Unknow";
		year = 2000;
		mileage = 0.0;
		//this("Unknown","Unknown",2000,0.0);
	}
	
	Car(String companyName,String modelName,int year,double mileage) {
		this.companyName = companyName;
		this.modelName = modelName;
		
		this.year = year < 1886? 2000:year;
		this.mileage = mileage;
	}
	
	public void setCompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}else {
			System.out.println("Error: Invalid company name");
		}
	}
	
	public String getCompanyName () {
		return this.companyName;
	}
	
	public void setModelName(String modelName) {
		return;
	}
	
	public String getModelName() {
		return this.modelName;
	}	
	
	public void setYear(int year) {
		if(year <= 1886) {
			this.year = year;
		}else {
			System.out.println("Error: Invalid year");
		}
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setMileAge(double mileage) {
		return;
	}
	
	public double getMileAge() {
		return this.mileage;
	}
	
	public void display() {
		System.out.println("Company Name"+ getCompanyName());
		System.out.println("Model Name"+ getModelName());
		System.out.println("Year"+ getYear());
		System.out.println("Mile Age"+ getMileAge());	
	}
}
