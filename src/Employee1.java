public class Employee1 extends Person1{
    private String office;
    private int salary;
    private Date dateHired;
    public Employee1(){
        super();
        office="zong";
        salary=900;
        dateHired=new Date(2020,3,1);
    }
    public Employee1(String name, String address, String email, int phone, String office, int salary, Date dateHired){
        super(name,address,email,phone);
        this.office=office;
        this.salary=salary;
        this.dateHired=dateHired;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public Date getDateHired() {
        return dateHired;
    }
    public void display(){
        System.out.println("Name: " + name + "\nAddress: "+address+ "\nEmail: "+email+ "\nPhone: "+phone+ "\nOffice: "+office
        + "\nSalary: "+ salary + "\nDate hired: ");
        dateHired.display();
    }
}
