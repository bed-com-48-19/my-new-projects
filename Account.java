class Account{
    private int ID; 
    private double balance;
    private double annualInterestRate;
    private String dateCreated;

    public Account(){
       // dateCreated = new java.util.Date();
    }

    public Account(int IDnumber, double newBalnce){
        this.ID = IDnumber;
        this.balance = newBalnce;
    }

    public int getID(){
        return ID;
    }
    public void setID(int newID){
        this.ID= newID;
    }

    public double GetBalance(){
        return balance;
    }
     public void setBalance(double newBalnce){
         this.balance = newBalnce;
     }

     public String getDate(){
         return dateCreated;
     }

     public double withDraw(double amount){
         return balance - amount;
     }

     public void deposit(double amount){
       double  balnce = balance - amount;
     }
     public double getMonthlyInterestRate(){
        double MonthlyInterest = MonthlyInterestRate;
        double MonthlyInterestRate = annualInterestRate / 12;
     }
}