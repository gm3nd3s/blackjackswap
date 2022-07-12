public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("John");
        System.out.println(player1.getName() + " has " + player1.getHandCounter() + " points at first hand.");
        Player player2 = new Player("Dealer");
        System.out.println(player2.getName() + " has " + player2.getHandCounter() + " points at first hand.");

        while(player1.getHandCounter() < 21 && player2.getHandCounter() < 21){
            player1.sumHandCounter();
            System.out.println(player1.getName() + " has " + player1.getHandCounter() + " this hand.");


            if(player1.getHandCounter() > 21) {
                System.out.println(player1.getName() + " got burst. " + player2.getName() + " won!");
                break;
            }
            if(player1.getHandCounter() == 21) {
                System.out.println(player1.getName() + " got 21 and won!");
                break;
            }




            player2.sumHandCounter();
            System.out.println(player2.getName() + " has " + player2.getHandCounter() + " this hand.");
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
    // 1. create players and dealer
    // 2. Goal of the player is to achieve a hand with nearer to 21
    // 3. Create random number for the dealt cards
    // 4. Tell the winner

}







