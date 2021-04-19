public class Staff extends  Employee1{
    private String title;
    public Staff(){
        super();
        title="manager";
    }
    public Staff(String name, String address, String email,int phone, String office, int salary, Date dateHired,String title){
        super(name, address, email, phone, office, salary, dateHired);
        this.title=title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void display(){
        System.out.println("Name: " + name + "\nAddress: "+address+ "\nEmail: "+email+ "\nPhone: "+phone +"\nOffice: "+getOffice()
                + "\nSalary: "+ getSalary() +  "\nTitle: "+title+ "\nDate hired: ");
        getDateHired().display();
    }
    }

