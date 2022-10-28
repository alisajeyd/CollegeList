package LabAkt;
import java.util.Scanner;

public class CollegeList {
	public static void main(String args[]) { 
		Scanner s = new Scanner(System.in); 
		Person person = new Person(); 
		Employee employee = new Employee();
		Faculty faculty = new Faculty();
		
			System.out.print("Press 'E' for Employee, 'F' for Faculty, and 'S 'for Student: "); 
			String choice = s.nextLine();
			
		while(true){
			if (choice.equalsIgnoreCase("E")) {
				System.out.println("Type Employee's name, contact number, salary and department. \nPress Enter after every input");
				person.setName(s.nextLine()); 
				person.setContactNum(s.nextLine()); 
				employee.setSalary(s.nextDouble()); 
				s.nextLine(); 
				employee.setDepartment(s.nextLine());
				
				System.out.println("------------------------	");
				System.out.println("Name: " + person.getName() + "\nContact Number: " + person.getContactNum() +
						"\nSalary: " + employee.getSalary() + "\nDepartment: " + employee.getDepartment());
				break;
			}
			else if (choice.equalsIgnoreCase("F")){
				System.out.println("Press 'Y' if the faculty member is regular/tenured or 'N' if not: "); String tenure = s.nextLine();
 
				while(true){
					if (faculty.isRegular() == tenure.equalsIgnoreCase("Y")){
						System.out.println("Type faculty's name, contact number, salary and department. \nPress Enter after every input");
						person.setName(s.nextLine());
						person.setContactNum(s.nextLine());
						employee.setSalary(s.nextDouble());
						s.nextLine(); 
						employee.setDepartment(s.nextLine());
						
						System.out.println("-----------------------------	");
						System.out.println("Name: " + person.getName() + "\nContact Number: " + person.getContactNum() +
								"\nSalary: " + employee.getSalary() + "\nDepartment: " + employee.getDepartment()
								+ "\nStatus: Regular");
						break;
					}
					
					else if(faculty.isRegular() == tenure.equalsIgnoreCase("N")){
						System.out.println("Type faculty's name, contact number, salary and department. \nPress Enter after every input");
						person.setName(s.nextLine()); 
						person.setContactNum(s.nextLine()); 
						employee.setSalary(s.nextDouble()); 
						s.nextLine(); 
						employee.setDepartment(s.nextLine());
						
						System.out.println("-----------------------------");
						System.out.println("Name: " + person.getName() + "\nContact Number: " + person.getContactNum() +
								"\nSalary: " + employee.getSalary() + "\nDepartment: " + employee.getDepartment()
								+ "\nStatus: Not Regular"); break;
					}
 
				}
				break;
			}
			else if(choice.equalsIgnoreCase("S")){ Student student = new Student();
			System.out.println("Type Student's name, contact number, enrolled program, and year level. "
					+ "\nPress Enter after every input");
			person.setName(s.nextLine()); 
			person.setContactNum(s.nextLine()); 
			student.setProgram(s.nextLine()); 
			student.setYearLevel(s.next());
			
			System.out.println("--------------------------------------	");
			System.out.println("Name: " + person.getName() + "\nContact Number: " + person.getContactNum() +
					"\nProgram: " + student.getProgram() + "\nYear Level: " + student.getYearLevel());
			break;
			}
		}
	}
}
