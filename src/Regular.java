public class Regular extends Employee {
    private int basicPay;
    public Regular(){
        basicPay=500;
    }
    public Regular(String name , String phone, String address, int allowance, int basicPay){
        super(name,phone,address,allowance);
        this.basicPay=basicPay;
    }

    public void setBasicPay(int basicPay) {
        this.basicPay = basicPay;
    }

    public int getBasicPay() {
        return basicPay;
    }

    public void display(){
        System.out.println("Name: "+ name+ "\nPhone: "+ phone + "\nAddress: "+ address+"\nAllowance: "+allowance+"\nBasic Pay: " +
                basicPay);
    }
}
