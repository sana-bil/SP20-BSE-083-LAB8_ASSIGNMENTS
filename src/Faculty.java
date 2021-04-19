public class Faculty extends  Employee1{
    private int officeHours;
    private String rank;
    public Faculty(){
        super();
        officeHours=9;
        rank="junior";
    }
    public Faculty(String name, String address, String email, int phone, String office, int salary, Date dateHired, int officeHours, String rank){
        super(name,address,email,phone,office,salary,dateHired);
        this.officeHours=officeHours;
        this.rank=rank;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void display(){
        System.out.println("Name: " + name + "\nAddress: "+address+ "\nEmail: "+email+ "\nPhone: "+phone +"\nOffice: "+getOffice()
                + "\nSalary: "+ getSalary() +  "\nOffice Hours: "+officeHours + "\nRank: "+ rank+"\nDate hired: ");
        getDateHired().display();
    }
}
