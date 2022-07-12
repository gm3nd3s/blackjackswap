public class Player {

    private int handCounter;
    private String name;

    public Player (String name){
        this.name = name;
        this.handCounter = 0;
        sumHandCounter();


    }


    public int getHandCounter() {
        return handCounter;
    }

    public void sumHandCounter() {
        handCounter = handCounter + randomCard();

        return;
    }

    public String getName() {
        return name;
    }

    private int randomCard(){
        int min = 1;
        int max = 13;
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
