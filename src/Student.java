public class Student extends Person{
    private String rollNo;
    private int marks;
    public Student(){
        super();
        rollNo="3b-083";
        marks=9;
    }
    public Student(String name , String id , int phone , String rollNo, int marks){
        super(name,id,phone);
        this.marks=marks;
        this.rollNo=rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
    public void display(){
        super.display();
        System.out.println("Roll No. "+ rollNo + "\nmarks: "+marks);
    }
}
