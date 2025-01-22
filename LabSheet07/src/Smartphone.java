
public class Smartphone {
	private String brand;
	private String model;
	private int storageCapacity;
	private int MAX_STORAGE_CAPACITY = 521;
	
	public void setBrand(String brand) {
		if(brand.length()>=2) {
			this.brand=brand;
		}else {
			System.out.println("Error: Brand must have at least 2 characters!");
		}
	}
	public String getBrand() {
		return this.brand;
	}
	
	public void setModel(String model) {
		if(model.length()>=2) {
			this.model=model;
		}else {
			System.out.println("Error: Brand must have at least 2 characters!");
		}
	}
	public String getModel() {
		return this.model;
	}
	public void setStorageCapacity(int storageCapacity) {
		if(storageCapacity>0 && storageCapacity<=512) {
			this.storageCapacity=storageCapacity;
		}else {
			System.out.println("Error: Storage capacity must be between 1 and 512 GB!");
		}
	}
	public int getStorageCapacity() {
		return this.storageCapacity;
	}
	public void increaseStorage(int additionalStorage) {
		if(additionalStorage+storageCapacity<512&&additionalStorage>0) {
			this.storageCapacity += additionalStorage;
		}else if(additionalStorage<0){
			System.out.println("Error: Additional storage must be positive");
		}else {
			System.out.println("Error: Storage capacity cannot exceed <"+ MAX_STORAGE_CAPACITY+"> GB!");
		}
	}
	public int getRemainingStorage(int usedStorage) {
		if(usedStorage>=0&&usedStorage<=storageCapacity) {
			return storageCapacity -= usedStorage;
		}else {
			System.out.println("Error: Used storage must be between 0 and "+storageCapacity+" GB!");
			return -1;
		}
	}
	public void printDetails() {
		System.out.println("Smartphone Details");
		System.out.println("Brand: "+ getBrand());
		System.out.println("Model: "+ getModel());
		System.out.println("Storage Capacity: "+ getStorageCapacity());
		
	}
}

