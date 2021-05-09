package lab6;
//bài 2 và bài 3 giống nhau vì có chung 1 cách làm.
public class lab63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("-------------------------------");
		// Employee 1
		SalariedEmployee A = new SalariedEmployee("Phát", "Nguyễn", "001", 2000);
		print(A.toString());
		print("earned: " + A.earnings());
		print("");
		// Employee 2
		HourlyEmployee B = new HourlyEmployee("Huệ", "Bùi", "002", 100, 40);
		print(B.toString());
		print("earned: " + B.earnings());
		print("");
		// Employee 3
		CommissionEmployee C = new CommissionEmployee("Như", "Huỳnh", "003", 30000, (double) 0.15);
		print(C.toString());
		print("earned: " + C.earnings());
		print("");
		// Employee 4
		BasePlusCommissionEmployee D = new BasePlusCommissionEmployee("Tâm", "Trần", "004", 30000, (double) 0.15,
				2000);
		;
		print(D.toString());
		print("earned: " + D.earnings());
		print("-------------------------------");
		print("Cộng 10% lương cơ bản mỗi NV");
		print("-------------------------------");
		//tạo mảng Employee
		Employee arrEmployee[] = new Employee[4]; 
		arrEmployee[0] = A;
		arrEmployee[1] = B;
		arrEmployee[2] = C;
		arrEmployee[3] = D;
		// Duyệt qua từng phần tử của mảng = for
		for (Employee currentEmployee : arrEmployee) {
			System.out.println(currentEmployee);
			// check Employee có lương cơ bản hay không, nếu có thì mới cộng 10%
			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				// Check bằng cách dùng hàm instanceof để xem có phải kiểu dữ liệu BasePlusCommissionEmployee không.
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
				// Nhân với 110% lương cơ bản hiện tại
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				print("new base salary is(+10%): "+ employee.getBaseSalary());
			}
			
			print("earned "+ currentEmployee.earnings());
			print("");
		}
	}
	public static void print(String text) {
		System.out.println(text);
	}
}

abstract class Employee {
	String firstName;
	String lastName;
	String SSN;
	Employee(String _firstName, String _lastName, String _SSN) {
		this.firstName = _firstName;
		this.lastName = _lastName;
		this.SSN = _SSN;
	}

	abstract double earnings();

	public String toString() {
		String textReturn = this.firstName + " " + this.lastName + "\n";
		textReturn += "social security number: " + this.SSN;
		return textReturn;
	}

}

class SalariedEmployee extends Employee {
	private double weeklySalary;

	SalariedEmployee(String _firstName, String _lastName, String _SSN, double _weeklySalary) {
		super(_firstName, _lastName, _SSN);
		this.weeklySalary = _weeklySalary;
	}
	
	public void setWeeklySalary(double _salary) {
		weeklySalary = _salary < 0.0 ? 0.0 : _salary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	@Override
	double earnings() {
		return this.weeklySalary;
	}

	@Override
	public String toString() {
		String textReturn = "salaried employee: " + this.firstName + " " + this.lastName + "\n";
		textReturn += "social security number: " + this.SSN + "\n";
		textReturn += "weekly salary: " + this.weeklySalary;
		return textReturn;
	}

}

class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	HourlyEmployee(String _firstName, String _lastName, String _SSN, double _wage, double _hours) {
		super(_firstName, _lastName, _SSN);
		this.wage = _wage;
		this.hours = _hours;
	}

	public void setWage(double _hourlyWage) {
		wage = (_hourlyWage < 0.0) ? 0.0 : _hourlyWage;
	}

	public double getWage() {
		return wage;
	}

	public void setHours(double _hoursWorked) {
		hours = ((_hoursWorked >= 0.0) && (_hoursWorked <= 168.0)) ? _hoursWorked : 0.0;
	}

	public double getHours() {
		return hours;
	}

	@Override
	double earnings() {
		if (hours <= 40) {
			return wage * hours;
		} else if (hours > 40) {
			return (double) (40 * wage + (hours - 40) * wage * (double) 1.5);
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		String textReturn = "hourly employee: " + this.firstName + " " + this.lastName + "\n";
		textReturn += "social security number: " + this.SSN + "\n";
		textReturn += "hourly wage: " + this.wage + "; hours worked: " + this.hours;
		return textReturn;
	}
}

class CommissionEmployee extends Employee {
	protected double grossSales;
	protected double commissionRate;

	CommissionEmployee(String _firstName, String _lastName, String _SSN, double _grossSales, double _commissionRate) {
		super(_firstName, _lastName, _SSN);
		this.grossSales = _grossSales;
		this.commissionRate = _commissionRate;
	}

	public void setCommissionRate(double _rate) {
		commissionRate = (_rate > 0.0 && _rate < 1.0) ? _rate : 0.0;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setGrossSales(double _sales) {
		grossSales = (_sales < 0.0) ? 0.0 : _sales;
	}

	public double getGrossSales() {
		return grossSales;
	}

	@Override
	double earnings() {
		return this.commissionRate * this.grossSales;
	}

	public String toString() {
		String textReturn = "commission employee: " + this.firstName + " " + this.lastName + "\n";
		textReturn += "social security number: " + this.SSN + "\n";
		textReturn += "gross sales: " + this.grossSales + "\n";
		textReturn += "commission rate: " + this.commissionRate;
		return textReturn;
	}
}

class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	BasePlusCommissionEmployee(String _firstName, String _lastName, String _SSN, double _grossSales,
			double _commissionRate, double _baseSalary) {
		super(_firstName, _lastName, _SSN, _grossSales, _commissionRate);
		this.baseSalary = _baseSalary;
	}

	public void setBaseSalary(double _salary) {
		baseSalary = _salary < 0.0 ? 0.0 : _salary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	@Override
	double earnings() {
		return super.earnings() + baseSalary;
	}

	public String toString() {
		String textReturn = "base salaried commission employee: " + this.firstName + " " + this.lastName + "\n";
		textReturn += "social security number: " + this.SSN + "\n";
		textReturn += "gross sales: " + this.grossSales + "\n";
		textReturn += "commission rate: " + this.commissionRate+ "\n";
		textReturn += "base salary: " + this.baseSalary;
		return textReturn;
	}
}