package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Vegetarian", "white","no meat", 5.00);
        hamburger.addition1("lettuce", .50);
        hamburger.addition2("tomatoes", .50);
        hamburger.addition3("onions", .50);
        hamburger.addition4("cheese" ,.50);
        hamburger.orderRecap();
        System.out.println("The total price is $" + hamburger.total());

        Hamburger hamburger1 = new Hamburger("no meat");
        HealthyBurger healthyBurger = new HealthyBurger(hamburger1);
        hamburger1.addition1("lettuce", .50);
        hamburger1.addition2("tomatoes", .50);
        hamburger1.addition3("onions", .50);
        hamburger1.addition4("cheese" ,.50);
        healthyBurger.addition5("mushrooms", .50);
        healthyBurger.addition6("potatoes", .50);
        healthyBurger.orderRecap();
        System.out.println("The total price is $" + hamburger1.total());

        Hamburger hamburger2 = new Hamburger("white", "no meat");
        DeluxeBurger deluxeBurger = new DeluxeBurger(hamburger2, "potato", "pepsi");
    }
}

