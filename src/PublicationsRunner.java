import java.util.Scanner;
public class PublicationsRunner {
    public static void main(String[] args) {
        System.out.println("What do you want? book or audio?");
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        if (string.equals("book")){
            Book book= new Book("The Witcher",100,1000);
            book.display();
        }
        else if (string.equals("audio")){
            Tape tape= new Tape("Stranger Things", 500, 200);
            tape.display();
        }
        else
            System.out.println("invalid");

    }
}
