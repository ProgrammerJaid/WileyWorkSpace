
public class UtilityClass {

	public void searchEmployees(DeptType dept, Employee[] employees) {
		for (Employee emp : employees)
			if (dept.toString().equals(emp.empDept))
				System.out.println(emp);
	}
	
	public void sortEmployees(Employee[] employees) {

		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length - i - 1; j++)
				if (employees[j].empGrossSalary > employees[j + 1].empGrossSalary)
					swap(employees, j);
		}
		printEmployees(employees);
	}
	
	private void printEmployees(Employee[] employees) {
		System.out.println("\nEmployee list in sorted order of their increasing gross salary.\n");
		for(Employee emp:employees)
			System.out.println(emp);
		System.out.println();
	}

	protected void swap(Employee[] employees, int j) {
		Employee temp = employees[j];
		employees[j] = employees[j + 1];
		employees[j + 1] = temp;
	}
	
}
