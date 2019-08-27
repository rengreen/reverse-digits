package pl.rengreen.reversedigits;

public class Main {

    public static void main(String[] args) {

        //input
        int number = 5321;

        //reversing digits
        Digits digits = new Digits();
        int result = digits.reverseDigits(number);

        //output
        System.out.println("Reversed number: " + result);
    }
}
