package pl.rengreen.reversedigits;

class Digits {

    long reverseDigits(int number) {
        long result = 0;

        while (number > 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }

        return result;
    }
}
