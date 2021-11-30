public class TestPayroll{
    public static void main(String[] args) {
		// instatiate two objects that initialises the constructor
		Payroll emp = new Payroll();

		// set thye pay information
		emp.setName("philip");
		emp.setIdNumber(222);
		emp.setHoursWorked(70.4);
		emp.setPayRate(8.20);

		// display the employee info

		 System.out.println("the Payroll info " + "\n" + "Name " + emp.getName() + "\n" + "ID number " + emp.getIdNumber() +
		  "\n" + "Number of hours worked" + emp.getHoursWorked() + "\n" + "Pay rate" + emp.getPayRate()
		  + "\n " + "Gross pay " + emp.getGrossPay());
	}
}