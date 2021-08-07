public class SharedDigit {

    public static boolean hasSharedDigit( int first, int second){

        if ((first <10 || first > 99) || (second < 10 || second > 99)){
            return false;
        }
        int num11 = first % 10;
        int num12 = first /10;
        int num21 =second % 10;
        int num22 =second /10;


        return ((num11 == num21) || (num11 == num22)) || ((num12 == num21) || (num12 == num22));
    }
}