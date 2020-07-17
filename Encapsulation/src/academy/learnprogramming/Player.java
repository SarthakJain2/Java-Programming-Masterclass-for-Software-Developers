package academy.learnprogramming;

public class Player {
    public String FullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= damage){
            System.out.println("Knocked out player");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
