package academy.learnprogramming;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        /* don't add pages printed as part of the constructor because you will print pages
        afterwards(separate method), cannot print pages while printer is being set up.
        */
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAdded){
        this.tonerLevel += tonerAdded;
        if(this.tonerLevel > 0 && this.tonerLevel <= 100){
            System.out.println("Toner level is " + this.tonerLevel + "%");
        }else{
            System.out.println("Incompatible toner level");
        }

        return tonerAdded;

    }

    public int printingPage(int pages){
        int pagestoPrint = pages;
        if(this.duplex){
            System.out.println("Printing in duplex mode");
            pagestoPrint = (pages / 2) + (pages % 2);
        }
        System.out.print(pagestoPrint + " pages is being printed.");
        this.pagesPrinted += pagestoPrint;
        return pagestoPrint;

    }




    public int getPagesPrinted() {
        return pagesPrinted;
    }


}
