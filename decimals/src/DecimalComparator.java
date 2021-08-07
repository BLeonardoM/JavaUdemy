public class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        int a = (int) (firstNumber * 1000);
        int b = (int) (secondNumber * 1000);

        if(a == b){
           return true;
        }
        else {
            return false;
        }
    }
}