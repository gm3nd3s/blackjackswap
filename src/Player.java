public class Player {


    private String name;
    private int handCounter;


    public Player (String name){
        this.name = name;
        this.handCounter = 0;
    }


    public int getHandCounter() {
        return handCounter;
    }

    public void sumHandCounter() {
        handCounter = handCounter + Main.randomCard();

        return;
    }

    public String getName() {
        return name;
    }

}
