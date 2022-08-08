package tursday_practice;

public class Employ {
	
	
	class Employee {
		private String name;
		private short yearOfJoining;
		private double salary;
		private String address;
		
		public Employee(String name, short yearOfJoining, double salary, String address) {
			this.name = name;
			this.yearOfJoining = yearOfJoining;
			this.salary = salary;
			this.address = address;
		}
		
		
		public String toString() {
			return name + "\t\t" + yearOfJoining + "\t\t   " + salary + "\t" + address;
		}



			
		}
		
		

	
	public static void main(String[] args) {
		Employee e1 = new Employee("sayam t Patil",(short)2021, 80000,"Kolhapur Maharashtra");
		Employee e2 = new Employee("rushi s Jadhav",(short)2018, 75000,"pune Maharashtra");
		Employee e3 = new Employee("Omkar a Koli",(short)2015, 65000,"satara Maharashtra");
		
		System.out.println("Employee Name \t Year of Joining \t Total Salary \t Address");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	

	}

}
