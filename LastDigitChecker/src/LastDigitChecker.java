public class LastDigitChecker {

    public static boolean hasSameLastDigit (int num1, int num2, int num3) {

        if ((num1 < 10 || num1 > 999) || (num2 < 10 || num2 > 999) || (num3 < 10 || num3 > 999)){
            return false;
        }
        int num11 = num1 % 10;
        int num12 = num2 % 10;
        int num13 = num3 % 10;

        return (num11 == num12) || (num11 == num13) || (num12 == num13);
    }

    public static boolean isValid (int num){
        return num >= 10 && num <= 999;
    }

}