package academy.learnprogramming;

import academy.learnprogramming.Player;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Sarthak";
//        player.health = 20;
//        player.weapon = "Sword";
//        player.weapon = "";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());


        EnhancedPlayer player = new EnhancedPlayer("Sarthak", 200, "Sword");
        System.out.println("Intial health is " + player.getHealth());
    }
}
