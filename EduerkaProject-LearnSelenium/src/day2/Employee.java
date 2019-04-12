package day2;

public class Employee {

	int salary;
	int bonus;
	 
	void calculateSalary()
	{
		salary=salary+bonus;
		System.out.println("Salary is : "+salary);
	}
	
	int calculateSalary1()
	{
		salary = salary + bonus;
		return salary;
	}
	
	void calculateSalary1(int salary,int bonus)
	{
		salary = salary + bonus;
		System.out.println("Salary of Employee is: "+ salary);
	}
	
	
		
	
}
