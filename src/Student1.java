public class Student1 extends Person1{
    private String status;
    public Student1(){
        super();
        status="Full-time";
    }
    public Student1(String name, String address, String email, int phone, String status){
        super(name,address,email,phone);
        this.status=status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    public void display(){
        System.out.println("Name: " + name + "\nAddress: "+address+ "\nEmail: "+email+ "\nPhone: "+phone + "\nStatus: "+status);
    }

}
