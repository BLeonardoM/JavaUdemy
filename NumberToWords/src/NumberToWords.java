public class NumberToWords {
    public static void numberToWords(int number){
        if(number<0) System.out.print("Invalid Value");
        int count = getDigitCount(number);
        number = reverse(number);
        for(int i=0; i<count; i++){
            int digit = number%10;
            switch(digit){
                case 0:
                    System.out.print("Zero "); break;
                case 1:
                    System.out.print("One "); break;
                case 2:
                    System.out.print("Two "); break;
                case 3:
                    System.out.print("Three "); break;
                case 4:
                    System.out.print("Four "); break;
                case 5:
                    System.out.print("Five "); break;
                case 6:
                    System.out.print("Six "); break;
                case 7:
                    System.out.print("Seven "); break;
                case 8:
                    System.out.print("Eight "); break;
                case 9:
                    System.out.print("Nine "); break;
                default: break;
            }
            number /= 10;
        }
    }

    public static int reverse(int number){
        int num = (number<0) ? number*-1 : number; // if number is negative, use ternary to make number positive
        String forwardStr = Integer.toString(num); // convert num to string
        StringBuilder sb = new StringBuilder(forwardStr); // use helper to build string
        String reverseStr = sb.reverse().toString(); // use built-in function to reverse string
        int reverse = Integer.parseInt(reverseStr); // convert string back to number using .parseInt
        if(number<0){reverse *=-1;} // if original number was negative, convert the reverse number back to a negative number
        return reverse;
    }

    // public static int reverse(int number) { // alternative method
    //     int reverse = 0;
    //     int digit = 0;
    //     while(number!=0) {
    //         digit = number%10;
    //         reverse = (reverse*10) + digit;
    //         number /= 10;
    //     }
    //     return reverse;
    // }

    public static int getDigitCount(int number){
        if (number<0) return -1;
        int count = 0;
        do{
            count++;
            number /= 10;
        }while (number>0);
        return count;
    }
}