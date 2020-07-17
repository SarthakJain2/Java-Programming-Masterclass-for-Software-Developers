package academy.learnprogramming;

public class Bedroom {

    private Bed bed;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Fan fan;

    public Bedroom(Bed bed, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Fan fan) {
        this.bed = bed;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.fan = fan;
    }

    public Bed getBed() {
        return bed;
    }

    private void bedroomLights(){
        System.out.println("Bedroom lights turned off");
    }

    public void lights1(){
        if(fan.isLights()){
            fan.lightsOff();
        }else{
            bedroomLights();

        }
    }

    public void time(int time){
        if(time >= 10){
            bed.sleep();
        }else{
            bed.notSleeping(time);
        }

    }




}
