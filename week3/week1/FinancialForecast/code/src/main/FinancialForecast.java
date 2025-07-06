package main;

public class FinancialForecast {
   
   static double forcastevalue(double salary,double increment,int year)
	{
		if(year==0) return salary;
		
		return forcastevalue(salary *(1+increment), increment, year-1);
			
	}
   public static void main(String arg [])
   {
	   double start_salary  = 1000;
	   double increment = 0.5;
	   int year = 5;
	   
	   
	   double result  = forcastevalue(start_salary,increment,year);
	   System.out.printf("Forcasted value after %d year: %.2f%n",year,result);
   }
}
