public class HomeActivityRunner {
    public static void main(String[] args) {
        Date date = new Date(2020,3,5);
        Staff staff = new Staff("Azaan", "islamabad", "abc@gmail.com",345,"ufone",985,date,"manager");
        staff.display();
        System.out.println();
        Staff staff1= new Staff();
        staff1.display();
        System.out.println();
        Employee1 employee1= new Employee1();
        employee1.display();
        System.out.println();
        Date date1= new Date(2012,4,7);
        Employee1 employee11= new Employee1("nimra ","rawalpindi","nimra@gmail.com",333,"ZTBL", 678, date1);
        employee11.display();
        System.out.println();
        Faculty faculty= new Faculty();
        faculty.display();
        System.out.println();
        Date date2= new Date(2016,5,8);
        Faculty faculty1= new Faculty("ali", "kashmir","ali@yahoo.com",999,"Burger king",500,date2,7,"senior");
        faculty1.display();
        System.out.println();
        Student1 student1= new Student1();
        student1.display();
        Student1 student11= new Student1("ali","rawalpindi","ali@gmail.com",678,"part-time");
        System.out.println();
        student11.display();



    }
}
