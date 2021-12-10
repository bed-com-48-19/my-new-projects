//this class is inherited from the program named Objectoriebtedprogram

public class Student extends ObjactOrientedProgram {
    private final String status = "senior";

    // constructor for student class
    public Student(){
    }
    public  String getStatus(){
        return status;
    }
    public String toString(){
        return  super.toString() + "\n the student status is " + status;
    }

}
