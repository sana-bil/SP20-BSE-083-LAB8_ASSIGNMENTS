public class Employee {
    protected String name;
    protected String phone;
    protected String address;
    protected int allowance;
    public Employee(){
        name="Musa";
        phone="999-888-765";
        address="islamabad";
        allowance=900;
    }
    public Employee(String name, String phone, String address, int allowance){
        this.name=name;
        this.phone=phone;
        this.address=address;
        this.allowance=allowance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    public int getAllowance() {
        return allowance;
    }
}
