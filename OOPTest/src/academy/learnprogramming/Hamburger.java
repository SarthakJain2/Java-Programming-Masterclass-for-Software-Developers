package academy.learnprogramming;

public class Hamburger {
    protected String name;
    protected String bread;
    protected String meat;
    protected double totalPrice;
    private String topping1;
    private double price1;
    private String topping2;
    private double price2;
    private String topping3;
    private double price3;
    private String topping4;
    private double price4;

    public Hamburger(String bread, String meat){
        this.bread = bread;
        this.meat = meat;
    }



    public Hamburger (String meat){
        this("Healthy", "brown", meat, 7.00);

    }


    public Hamburger(String name, String bread, String meat, double totalPrice) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.totalPrice = totalPrice;
        overall();
    }

    public void overall (){

        System.out.println("Customer ordered the " + name + " burger with " + bread + " bread and " + meat + ". The subtotal is $"
                + totalPrice);
    }


    public void addition1 (String topping1, double price1){
        this.topping1 = topping1;
        this.price1 = price1;
        if(this.topping1 != null){
            this.totalPrice += this.price1;
            System.out.println("Customer wants " + topping1 + " which costs $" + price1);

        }
    }

    public void addition2(String topping2, double price2) {
        this.topping2 = topping2;
        this.price2 = price2;
        if (this.topping2 != null) {
            this.totalPrice += this.price2;
            System.out.println("Customer wants " + topping2 + " which costs $" + price2);
        }
    }

    public void addition3(String topping3, double price3) {
        this.topping3 = topping3;
        this.price3 = price3;
        if (this.topping3 != null) {
            this.totalPrice += this.price3;
            System.out.println("Customer wants " + topping3 + " which costs $" + price3);
        }
    }

    public void addition4(String topping4, double price4) {
        this.topping4 = topping4;
        this.price4 = price4;
        if (this.topping4 != null) {
            this.totalPrice += this.price4;
            System.out.println("Customer wants " + topping4 + " which costs $" + price4);
        }
    }

    public void orderRecap(){
        if(this.topping1 == null){
            System.out.println("Customer did not order for additional toppings");
        }else if(this.topping2 == null){
            System.out.println("Customer ordered 1 additional topping");
        }else if(this.topping3 == null){
            System.out.println("Customer ordered 2 additional toppings");
        }else if(this.topping4 == null){
            System.out.println("Customer ordered 3 additional toppings");
        }else{
            System.out.println("Customer ordered 4 additional toppings");
        }
    }

    public double total(){

        double hamburgerPrice = this.totalPrice;
        return hamburgerPrice;
    }


}

