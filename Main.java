package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsString " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString +=1;
        number +=1;

        System.out.println("numberAsString " + numberAsString);
        System.out.println("number = " + number);
        Thing f = new Thing(6);
        Thing g = new Thing(8);
        g.combine(f);
        System.out.println(f.geta());
        System.out.println(g.geta());


    }
}
