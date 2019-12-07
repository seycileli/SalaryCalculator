package SalaryCalculator;

public class Trainee extends employee {

	protected static double getBasicSalary() {
		return basicSalary;
	}
	protected static void setBasicSalary(double basicSalary) {
		Trainee.basicSalary = basicSalary;
	}
	
	@Override
	public double calculateTransportAllowance () {
		double transportAllowance = 10/100 * basicSalary;
		return transportAllowance;
	}
}
