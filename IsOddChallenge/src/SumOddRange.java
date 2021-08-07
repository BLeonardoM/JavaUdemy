public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }


    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0) {
            return -1;
        }
        if (start > end) {
            return -1;
        }

        int sumStart = 0;

        for (long i = start; i <= end; i++) {
            if (isOdd((int) i)) {
                sumStart += i;

            }
        }
        return sumStart ;

    }

}
