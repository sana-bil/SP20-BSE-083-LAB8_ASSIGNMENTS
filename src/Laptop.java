public class Laptop extends  Computer{
    private String length, height, width,weight;
    public Laptop(){
        super();
        length="10 inches";
        height="15 inches";
        width="15 inches";
        weight="40 kg";
    }
    public Laptop(String wordSize, String memorySize, String storageSize, String speed, String length, String height, String width, String weight){
        super(wordSize, memorySize, storageSize, speed);
        this.length=length;
        this.weight=weight;
        this.width=width;
        this.height=height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getLength() {
        return length;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getWidth() {
        return width;
    }
    public String toString(){
       return super.toString()+ "\nLength: "+length + "\nWidth: "+ width + "\nHeight: "+ height + "\nWeight: "+ weight;
    }
}
