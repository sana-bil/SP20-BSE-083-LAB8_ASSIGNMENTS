public class Tape extends Publications{
    private int playingTime;
    public Tape(){
        super();
        playingTime=120;
    }
    public Tape(String title, int price, int playingTime){
        super(title, price);
        this.playingTime=playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    public int getPlayingTime() {
        return playingTime;
    }
    public void display(){
        System.out.println("Title: " + title + "\nPrice: "+ price+ "\nPlaying time: "+playingTime);
    }
}
