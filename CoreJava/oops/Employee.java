package oops;

public class Employee {
	
	private int empId;
	
	private String empName;
	
	private int empSal;
	
	private String empAdd;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	
	public Employee() {
		
	}

	public Employee(int empId, String empName, int empSal, String empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAdd = empAdd;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAdd=" + empAdd + "]";
	}
	
	
	

}
