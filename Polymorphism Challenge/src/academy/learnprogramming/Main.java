package academy.learnprogramming;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.wheels = 4;
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
    return  "Car --> start engine";
    }

    public String accelerate(){
        return  "Car --> accelerate";
    }

    public String brake(){
    return "Car --> brake";
    }
}

class Lambo extends Car{

    public Lambo(int cylinders, String name) {
        super(cylinders, name);

    }


    @Override
    public String startEngine() {
        return  "Lambo --> start engine";
    }

    @Override
    public String accelerate() {
        return "Lambo --> accelerate";
    }

    @Override
    public String brake() {
        return "Lambo --> brake";
    }
}

class Toyota extends Car{
    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
     return "Toyota --> start engine";
    }

    @Override
    public String accelerate() {
        return "Toyota --> accelerate";
    }

    @Override
    public String brake() {
        return "Toyota --> brake";
    }
}

class Porsche extends Car{
    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
       return "Porsche --> start engine";
    }

    @Override
    public String accelerate() {
       return "Porsche --> accelerate";
    }

    @Override
    public String brake() {
       return "Porsche --> brake";
    }
}



public class Main {

    public static void main(String[] args) {

    }
}
