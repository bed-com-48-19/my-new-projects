public class Employee extends ObjactOrientedProgram {

    // data fields for an employee
    private String office = "Computer science department, Lecture in computer science";
    private  double salary = 1000000;
    private  java.util.Date dateHired;

    public  Employee(){
        this.dateHired = new java.util.Date();
    }
    // creating accessors and muttators

    public String getOffice(){
        return office;
    }

    public void setOffice(String office){
        this.office= office;
    }
    public  double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String toString(){
        return super.toString() + "\n the person works at  " + office + "\n the employees salary MKW: " + salary +
                "\n date employed on:" + dateHired;
    }
}
