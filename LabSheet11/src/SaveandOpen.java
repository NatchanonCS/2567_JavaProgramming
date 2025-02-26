import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee{
	
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		Scanner input = new Scanner(System.in);
		PrintWriter writeFile = new PrintWriter(new FileWriter("src\\txtFile\\List107.txt",true));
		String answer;
		
		do {
			super.header();
			System.out.print("Enter name : ");
			name = input.next();
			System.out.print("Enter deptment : ");
			dept = input.next();
			writeFile.println(name+"\t"+dept);
			System.out.print("Do you want to input data again? : ");
			answer = input.next();
			
		}while(answer.equalsIgnoreCase("y"));
		
	}
	
	public void searchData() {
		try {
			Scanner readFile = new Scanner(new File("src\\\\txtFile\\\\List107.txt"));
			int i=0;
			boolean check = false;
			super.header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+")"+name);
					
				}
				if(check) {
					super.header();
					System.out.print("Employee in dept "+ super.getDept());
					
				}
				else {
					System.out.println("\nSorry no dept: "+ super.getDept());
				}
			}
			
			
		}catch(IOException e) {
			System.out.print("\nSorry, file not found....");
		}
	}

}
