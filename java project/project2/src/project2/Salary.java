package project2;

public class Salary {
	private double sum;
			int month;
			double tax;
//	public Salary(double a, int b, double c) {
//		this.sum = a;
//		this.month = b;
//		this.tax = c;
//	}
	public void setSum(double a) {
		this.sum = a;
	}
	public void setMonth(int b) {
		this.month = b;
	}
	public void setTax(double c) {
		this.tax = c;
	}
	public double getSum() {
		return sum;
	}
	public int getMonth() {
		return month;
	}
	public double getTax() {
		return tax;
	}
}
