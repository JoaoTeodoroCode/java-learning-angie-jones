package chapter13exceptions.independentexercise;

public class DividingByZero {
    public static void main(String[] args){
        try{
            int c = 30/0;
        }catch(ArithmeticException e){
            System.out.println("You can´t divide a number by zero");
        }finally{
            System.out.println("Division is fun");
        }
    }
}
