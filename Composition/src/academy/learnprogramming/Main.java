package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red" );
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.powerUp();
        Bed bed = new Bed("queen", "right",2,1);
        Wall wall1 = new Wall("right");
        Wall wall2 = new Wall("left");
        Wall wall3 = new Wall("in front");
        Wall wall4 = new Wall("behind");
        Fan fan = new Fan(true, 3);
        Bedroom bedroom = new Bedroom(bed,wall1,wall2,wall3,wall4,fan);
        bedroom.getBed().makingBed();
        bedroom.lights1();
        bedroom.time(10);


          }
}
