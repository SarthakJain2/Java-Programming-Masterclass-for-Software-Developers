package academy.learnprogramming;

public class HealthyBurger {
    private Hamburger hamburger;
    private String topping5;
    private double price5;
    private String topping6;
    private double price6;

    public HealthyBurger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }



//    public void healthyAdditions() {
//        hamburger.addition1("lettuce", .50);
//        hamburger.addition2("tomatoes", .50);
//        hamburger.addition3("onions", .50);
//        hamburger.addition4("cheese" ,.50);
//    }



    public void addition5(String topping5, double price5) {
        this.topping5 = topping5;
        this.price5 = price5;
        if (this.topping5 != null) {
            hamburger.totalPrice += this.price5;
            System.out.println("Customer wants " + topping5 + " which costs $" + price5);
        }
    }

    public void addition6(String topping6, double price6) {
        this.topping6 = topping6;
        this.price6 = price6;
        if (this.topping5 != null) {
            hamburger.totalPrice += this.price6;
            System.out.println("Customer wants " + topping6 + " which costs $" + price6);
        }
    }





    public void orderRecap() {
        if(topping6 == null){
            System.out.println("Customer ordered 5 additional toppings");
        }else{
            System.out.println("Customer ordered 6 additional toppings");

        }
    }
}
