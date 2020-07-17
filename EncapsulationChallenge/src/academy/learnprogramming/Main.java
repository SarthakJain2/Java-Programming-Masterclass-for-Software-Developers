package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        printer.printingPage(15);
        System.out.println(" Total pages printed is " + printer.getPagesPrinted());
        printer.printingPage(15);
        System.out.println(" Total pages printed is " + printer.getPagesPrinted());
        System.out.println(printer.addToner(20) + "% toner was added");


    }
}
