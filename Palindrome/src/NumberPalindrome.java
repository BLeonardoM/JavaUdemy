public class NumberPalindrome {

    public static boolean isPalindrome (int number){
        if (number <0){
            number = -number;
        }

        int var = number;
        int remainder =0;
        int sum = 0;

          while (var > 0){
                remainder = var % 10;
                sum = (sum * 10) + remainder;
                var = var / 10;
          }
        return number == sum;


    }



}