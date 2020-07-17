package academy.learnprogramming;


public class Main {

    public static void main(String[] args) {
        //if-else
        int test = 5;
        if(test < 5){
            System.out.println("test is less than 5");
        }else if (test > 5){
            System.out.println("test is greater than 5");
        }else{
            System.out.println("test equals 5");
        }

        //for

        for(int i=0; i<5; i++){
            System.out.println("I is currently " + i);

        }

        //while and do while

        int count = 1;

        while (count != 6){
            System.out.println("Count = " + count);
            count++;

        }
        int number = 0;
        do{
            number ++;


        }while (number !=5);

        //extra

        int[] grades ={ 5,6,7,8};
        for(int grade:grades){
            System.out.println(grade);
        }

        String[] colors = {"Blue", "Green", "Red"};
        for(int i = 0; i < 3; i++){
            System.out.println(colors[i]);
        }
    }
}
