package academy.learnprogramming;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;

    }
    public double getAdditionResult(){
        double total = 0;
        total = firstNumber + secondNumber;
        return total;
    }
    public double getSubtractionResult(){
        double total = 0;
        total = firstNumber - secondNumber;
        return total;
    }
    public double getMultiplicationResult(){
        double total = 0;
        total = firstNumber * secondNumber;
        return total;
    }
    public double getDivisionResult(){
        double total = 0;
        total = firstNumber / secondNumber;
        if(secondNumber == 0.0){
            return 0.0;
        }else{
            return total;
        }
    }
}
