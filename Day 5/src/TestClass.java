public class TestClass {

	public static void main(String[] args) {
		Employee[] emps = new Employee[] 
				{new Employee(1, "Sk Jaid", DeptType.JavaDeveloper.toString(), 10000),
				new Employee(2,"Naga Prasad",DeptType.JavaDeveloper.toString(),12000),
				new Employee(3,"Deepak",DeptType.ScrumDeveloper.toString(),12000),
				new Employee(4,"Mohit Jangit",DeptType.JavaDeveloper.toString(),14000),
				new Employee(5,"Sagar Sutar",DeptType.ScrumMaster.toString(),20000)};
		
		/*sortEmployees(emps);
		searchEmployees(DeptType.ScrumDeveloper, emps);
		UtilityClass ut = new UtilityClass();
		ut.sortEmployees(emps);
		ut.searchEmployees(DeptType.JavaDeveloper, emps);*/
		
		Employee.sortEmployees(emps);
		Employee.searchEmployees(DeptType.JavaDeveloper, emps);
		Employee emp1 = new Employee(1,"Sk Jaid",DeptType.ScrumMaster.toString(),20000);
		Employee emp2 = new Employee(1, "S Jaid", "JavaDeveloper", 15000);
		System.out.println(emp1.equals(emp2));
	}
	
	/*private static void searchEmployees(DeptType dept, Employee[] employees) {
		for (Employee emp : employees)
			if (dept.toString().equals(emp.empDept))
				System.out.println(emp);
	}
	
	public static void sortEmployees(Employee[] employees) {

		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length - i - 1; j++)
				if (employees[j].empGrossSalary > employees[j + 1].empGrossSalary)
					swap(employees, j);
		}
		printEmployees(employees);
	}
	
	private static void printEmployees(Employee[] employees) {
		System.out.println("\nEmployee list in sorted order of their increasing gross salary.\n");
		for(Employee emp:employees)
			System.out.println(emp);
		System.out.println();
	}

	protected static void swap(Employee[] employees, int j) {
		Employee temp = employees[j];
		employees[j] = employees[j + 1];
		employees[j + 1] = temp;
	}*/
}
