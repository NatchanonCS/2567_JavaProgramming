import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many students in classroom: ");
		int numberofStudent = scan.nextInt();
		scan.nextLine();
		
		Student[] students = new Student[numberofStudent];
		
		for(int i=0; i<numberofStudent;i++) {
			
			students[i] = new Student();
			System.out.println("lnINPUT INFORMATION OF STUDENT "+(i+1));
			Line();
			
			System.out.print("Input student name: ");
			//String stdName = scan.nextLine();
			//students[i].setname(stdName);
			students[i].setname(scan.nextLine());
			
			while(true) {
				System.out.print("Input student score");
				int score = scan.nextInt();
				
				scan.nextLine();
				students[i].setScore(score);
				if(students[i].checkScore()) {
					//System.out.print("Input score again");
					break;
					
				}
				
			}
			System.out.println("\nLIST OF PASS STUDENT(>=50) :");
			Line();
			for(Student student : students) {
				if(student.isPass()) {
					System.out.print(">> "+student.getName()+"("+student.getScore()+")");
					
				}
				
			}
			
			
			
		}
		
		
		
		
		
		scan.close();

	}
	
	public static String findGrade(int score) {
		if(score>=80) return "A";
		else if(score>=76) return "B+";
		else if(score>=70) return "B";
		else if(score>=66) return "C+";
		else if(score>=60) return "C";
		else if(score>=56) return "D+";
		else if(score>=50) return "D";
		else return "F";
	}
	
	public static void Line() {
		for(int i=1;i<=60;i++) {
			System.out.print("-");			
		}
		System.out.println();
	}

}
