
public class DemoCar {

	public static void main(String[] args) {
		
		Car car = new Car("Chevrolet","Cruze",2009,150000.0);
		car.display();
		Spacing();
		System.out.println("Updated Car Details:");
		car.setCompanyName("Toyota");
		car.setModelName("corolla");
		car.display();
		car.setYear(2015);
		car.setYear(1860);
		car.setModelName(null);
	}
	public static void Spacing() {
		System.out.println();
		
	}

}
