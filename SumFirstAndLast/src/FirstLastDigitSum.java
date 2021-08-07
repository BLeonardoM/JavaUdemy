public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstNum = number % 10;

        while (number > 9) {
            number = number / 10;


        }
        return firstNum + number;
    }

}