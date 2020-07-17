package academy.learnprogramming;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber a){
        this.real += a.getReal();
        this.imaginary += a.getImaginary();

    }
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber s){
        this.real -= s.getReal();
        this.imaginary -= s.getImaginary();
    }
}
