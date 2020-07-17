package academy.learnprogramming;

public class Fan {
    private boolean lights;
    private int speed;

    public Fan(boolean lights, int speed) {
        this.lights = lights;
        this.speed = speed;
    }

    public boolean isLights() {
        return lights;
    }

    public void lightsOff(){
        System.out.println("fan lights turned off");
    }
}
