package pl.rengreen.reversedigits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        System.out.println("REVERSING INTEGER DIGITS");

        //input
        int number = readNumber();

        //reversing digits
        Digits digits = new Digits();
        long result = digits.reverseDigits(number);

        //output
        if (number%10==0) {
            System.out.println("Warning! Zeros as initial digits are not visible.");
        }
        if (result <= Integer.MAX_VALUE) {
            System.out.println("Reversed number: " + result);
        } else {
            System.out.println("Reversed number " + result + " exceeds Integer range (" + Integer.MAX_VALUE + ")");
        }

    }

    private static int readNumber() {
        int number = 0;
        boolean isValid = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!isValid) {
            try {
                System.out.print("Please enter positive integer number: ");
                number = Integer.parseInt(reader.readLine());
                if (number < 0) {
                    isValid = false;
                    System.out.println("Number " + number + " is negative.");
                } else {
                    isValid = true;
                    System.out.println("Number: " + number);
                }
            } catch (NumberFormatException n) {
                System.out.println("Invalid number format or number out of Integer range.");
                isValid = false;
            } catch (IOException e) {
                System.out.println("Data reading is not correct.");
                isValid = false;
            }
        }
        return number;
    }
}
