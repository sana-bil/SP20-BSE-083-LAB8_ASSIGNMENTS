public class Book extends Publications{
    private int pageCount;
    public Book(){
        super();
        pageCount=800;
    }
    public Book(String title, int price, int pageCount){
        super(title,price);
        this.pageCount=pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
    public void display(){
        System.out.println("Title: " + title + "\nPrice: "+ price+ "\nPage count: "+ pageCount);
    }
}
