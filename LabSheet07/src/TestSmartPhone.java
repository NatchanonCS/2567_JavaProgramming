
public class TestSmartPhone {
public static void main(String[] args) {
		
		Smartphone phone = new Smartphone();
		
		System.out.println("กา ลงัต้งัค่าขอ้ มูลสมาร์ทโฟนเริ่มตน้ ...");
		phone.setBrand("SmartMobile"); 
		phone.setModel("W1000"); 
		phone.setStorageCapacity(256); 
		
		System.out.println("\nขอ้ มูลสมาร์ทโฟนเบ้ืองตน้ :");
		phone.printDetails();
		
		System.out.println("\nเพิ่มความจุหน่วยความจา 100 GB...");
		phone.increaseStorage(100); 
		
		System.out.println("\nพยายามเพิ่มความจุหน่วยความจา 200 GB...");
		phone.increaseStorage(200); 
		
		System.out.println("\nพยายามเพิ่มความจุหน่วยความจา -50 GB...");
		phone.increaseStorage(-50); 
		
		System.out.println("\nคา นวณพ้ืนที่หน่วยความจา ที่เหลือโดยใชไ้ปแลว้ 120 GB...");
		int remainingStorage = phone.getRemainingStorage(120); // ค านวณส าเร็จ
		if (remainingStorage != -1) {
			System.out.println("พ้ืนที่ที่เหลือ: " + remainingStorage + " GB");
		}
		phone.increaseStorage(120);
		
		System.out.println("\nคา นวณพ้ืนที่หน่วยความจา ที่เหลือโดยใชไ้ปแลว้ 500 GB...");
		phone.getRemainingStorage(500); 
		
		System.out.println("\nต้งัค่าแบรนด์และรุ่นดว้ยค่าที่ไม่ถูกตอ้ง...");
		phone.setBrand(""); 
		phone.setModel("A"); 
		
		System.out.println("\nต้งัค่าความจุหน่วยความจา ที่ไม่ถูกตอ้ง...");
		phone.setStorageCapacity(600); 
		System.out.println("\nข้อมูลสมาร์ทโฟนสุดท้าย:");
		phone.printDetails();
}
}