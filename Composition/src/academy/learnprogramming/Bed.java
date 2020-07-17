package academy.learnprogramming;

public class Bed {
    private String size;
    private String location;
    private int pillows;
    private int quilt;


    public Bed(String size, String location,int pillows, int quilt) {
        this.size = size;
        this.location = location;
        this.pillows = pillows;
        this.quilt = quilt;

    }

    public void makingBed(){
        System.out.println("making bed");
    }

    public void sleep(){
        System.out.println("going to sleep");
    }

    public void notSleeping(int time){
        System.out.println("Current time is " + time + " will go to sleep at 10");

    }
}
