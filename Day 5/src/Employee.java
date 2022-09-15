
public class Employee {

	private int empId;
	private String empName;
	protected String empDept;
	protected double empGrossSalary;
	private double empBasicSalary;

	public Employee() {
	}

	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
	}

	public double calculateGrossSalary() {
		double hra = (12 * empBasicSalary) / 100;
		double da = (8 * empBasicSalary) / 100;
		return this.empGrossSalary = empBasicSalary - hra - da;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empGrossSalary="
				+ empGrossSalary + ", empBasicSalary=" + empBasicSalary + "]";
	}

	public boolean equals(Employee emp) {
		return (this.empId==emp.empId && this.empName==emp.empName);
	}
	
	public static void searchEmployees(DeptType dept, Employee[] employees) {
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

	private static void swap(Employee[] employees, int j) {
		Employee temp = employees[j];
		employees[j] = employees[j + 1];
		employees[j + 1] = temp;
	}

}
