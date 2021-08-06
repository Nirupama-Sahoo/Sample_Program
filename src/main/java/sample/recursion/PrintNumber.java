package sample.recursion;

public class PrintNumber {
    void sum(int number){
        if(number == 5){
            return;
        }
        sum(number+1);
        System.out.println(number);
    }
    public static void main (String args[]){
        PrintNumber printNumber = new PrintNumber();
        printNumber.sum(1);

    }
}
