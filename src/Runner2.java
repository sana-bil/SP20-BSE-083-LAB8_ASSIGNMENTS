public class Runner2 {
    public static void main(String[] args) {
        Regular regular= new Regular();
        regular.display();
        System.out.println();
        Regular regular1= new Regular("sanabil", "222-33","islamabad",700,500);
        regular1.display();
        System.out.println();
        Adhoc adhoc= new Adhoc();
        adhoc.display();
        System.out.println();
        Adhoc adhoc1= new Adhoc("wentworth","7890-99","chicago",456,7,100);
        adhoc1.display();
    }
}
