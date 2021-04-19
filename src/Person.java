public class Person {
    protected String name;
    protected String id;
    protected int phone;
    public Person(){
        name="sanabil";
        id="sp20-bse";
        phone=234;
    }
    public Person(String name, String id, int phone){
        this.name=name;
        this.id=id;
        this.phone=phone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }
    public void display(){
        System.out.println("Name: " + name + "\nID: "+ id + "\nPhone: "+phone);
    }
}
