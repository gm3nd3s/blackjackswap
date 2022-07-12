public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("John");
        Player player2 = new Player("Dealer");

        while(player1.getHandCounter() < 21 && player2.getHandCounter() < 21){

            player1.sumHandCounter();
            System.out.println(player1.getName() + " has " + player1.getHandCounter() + " points.");

            if(player1.getHandCounter() > 21) {
                System.out.println(player1.getName() + " got burst. " + player2.getName() + " won!");
                break;
            }
            if(player1.getHandCounter() == 21) {
                System.out.println(player1.getName() + " got 21 and won!");
                break;
            }

            player2.sumHandCounter();
            System.out.println(player2.getName() + " has " + player2.getHandCounter() + " points.");
            if (player2.getHandCounter() > 21) {
                System.out.println(player2.getName() + " got burst. " + player1.getName() + " won!");
                break;
            }
            if(player2.getHandCounter() == 21) {
                System.out.println(player2.getName() + " got 21 and won!");
                break;
            }
        }

    }

    static int randomCard(){
        int min = 1;
        int max = 13;
        return (int) (Math.random() * (max - min + 1) + min);
    }

}







