package day08_IfStatement;

            public class SalaryCalculator {
                public static void main(String[] args) {


        int hourlyRates = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6.5;
        double federalTaxRate = 26.2;

        //----------------------------
                    int salaryBeforeTax = hourlyRates * weeklyHours * 52; // salary is equal to one week salary * 52 weeks in a year
                    double stateTax = salaryBeforeTax * stateTaxRate / 100; // formula to calculate for percentage
                    double federalTax = salaryBeforeTax * federalTaxRate / 100;
                    double totalTax = stateTax + federalTax;
                    double salaryAfterTax = salaryBeforeTax - totalTax;


                    System.out.println("Gross pay is: $ " + salaryBeforeTax);
                    System.out.println("State tax = $" + stateTax);
                    System.out.println("Federal tac = $" + federalTax);
                    System.out.println("Total tax = $ " + totalTax);
                    System.out.println("Net income = $ " + salaryAfterTax);





        /*
        3. Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
					   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560

         */

    }


}
