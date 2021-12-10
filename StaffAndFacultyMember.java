public class StaffAndFacultyMember extends Employee{
    // data field for a staff and faculty member
    private String title = "associate lecture";
    private int workingHours = 7;

    // constructor
    public StaffAndFacultyMember(){
    }

    public  double getWorkingHours(){
        return  workingHours;
    }
    public  String toString(){
        return super.toString() + "\n the persons title " + title + "\n the persons working hours at office" + workingHours;
    }
}
