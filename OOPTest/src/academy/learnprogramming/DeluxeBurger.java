package academy.learnprogramming;

public class DeluxeBurger {
    private Hamburger hamburger;
    private String chips;
    private String drink;




    public DeluxeBurger(Hamburger hamburger, String chips, String drink) {
        this.hamburger = hamburger;
        this.chips = chips;
        this.drink = drink;
        System.out.println("Customer ordered the Deluxe Burger with " + hamburger.bread + " bread, " +
                hamburger.meat + ", " + chips + " chips ,and " + drink + ". The total is $10.00");
    }

    public void drinkOptions(){
        System.out.println("Drink options include: Pepsi, Coke, Sprite, Fanta, Mountain Dew, Diet Pepsi, " +
                "Diet Coke, Powerade, Root Beer, Dr.Pepper, Orange Juice, Hi-C, Iced Tea, Coffee, Milk, Chocolate Milk, " +
                "Oreo Shake, Vanilla Shake, Chocolate Shake, Strawberry SHake Frozen Coke, Frozen Wild Cherry, and Water. ");
    }

    public void chipOptions(){
        System.out.println("Chip options include: Lays, Fritos, Doritos, Sun Chips, Jalapeno Chips, and Cheetos.");
    }
}
