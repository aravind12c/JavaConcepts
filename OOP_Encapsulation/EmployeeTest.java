package OOP_Encapsulation;

// Wrapping up of a data into a single unit is call an encapsulation
//i.e if any variable is declared as private can be accessed by passing that variable into a  method [ getSalary() ]

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee("Tom", 25, 1000);
		
		System.out.println(e1.name);
		System.out.println(e1.age);
			
		System.out.println(e1.getSalary());
		
		e1.getAddress();
		
		e1.getEmployeeBankData();
		
	}

}
