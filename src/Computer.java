public class Computer {
    protected String wordSize;
    protected String memorySize;
    protected String storageSize;
    protected String speed;
    public Computer(){
        wordSize="7 bits";
        memorySize="123 MB";
        storageSize="290 MB";
        speed="300 MHz";
    }
    public Computer(String wordSize, String memorySize, String storageSize, String speed){
        this.wordSize=wordSize;
        this.memorySize=memorySize;
        this.storageSize=storageSize;
        this.speed=speed;
    }
    public String toString(){
        return "Word Size: "+ wordSize + "\nMemory Size: "+ memorySize+ "\nStorage Size: "+ storageSize + "\nSpeed"+ speed;
    }
}
