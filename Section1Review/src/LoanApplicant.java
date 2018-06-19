
public class LoanApplicant {
	private double salary;
	private int yearsOnJob;

	public LoanApplicant(double annualSalary, int yearsOnJob){
		this.salary = annualSalary;
		this.yearsOnJob = yearsOnJob;
	}
	
	public boolean qualifies(){
		if(salary > 100000){
			return true;
		}
		else if(salary <= 100000 && salary > 50000){
			if(yearsOnJob >= 2){
				return true;
			}
			else{
				return false;
			}
		}
		else if(salary <= 50000 && salary > 30000){
			if(yearsOnJob >= 5){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
	
	public void setYearsOnJob( int years){
		this.yearsOnJob = years;
	}
	
	public int getYearsOnJob(){
		return this.yearsOnJob;
	}
	
	public void setAnnualSalary(double salary){
		this.salary = salary;
	}
}
