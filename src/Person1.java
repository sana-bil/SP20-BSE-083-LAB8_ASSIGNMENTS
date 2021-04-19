public class Person1 {
    protected String name;
    protected String address;
    protected String email;
    protected int phone;
    public Person1(){
        name="Sanabil";
        address="islamabad";
        email="xyz@gmail.com";
        phone=234;
    }
    public Person1(String name,String address, String email , int phone){
        this.name=name;
        this.address=address;
        this.email=email;
        this.phone=phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }
    public void display(){
        System.out.println("Name: " + name + "\nAddress: "+address+ "\nEmail: "+email+ "\nPhone: "+phone);
    }
}
