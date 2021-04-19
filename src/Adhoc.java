public class Adhoc extends  Employee{
    private int NoOfWorkingDays;
    private int wage;
    public Adhoc(){
        super();
        NoOfWorkingDays=5;
        wage=250;
    }
    public Adhoc(String name, String phone, String address, int allowance, int noOfWorkingDays, int wage){
        super(name,phone,address,allowance);
        this.NoOfWorkingDays=noOfWorkingDays;
        this.wage=wage;
    }

    public void setNoOfWorkingDays(int noOfWorkingDays) {
        NoOfWorkingDays = noOfWorkingDays;
    }

    public int getNoOfWorkingDays() {
        return NoOfWorkingDays;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getWage() {
        return wage;
    }
    public void display(){
        System.out.println("Name: "+ name+ "\nPhone: "+ phone + "\nAddress: "+ address+"\nAllowance: "+allowance+"\nNo of working Days: "
        + NoOfWorkingDays + "\nWage: "+wage);
    }
}
