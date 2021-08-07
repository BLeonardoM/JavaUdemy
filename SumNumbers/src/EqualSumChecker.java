public class EqualSumChecker {

    public static boolean hasEqualSum (int n1, int n2, int n3){

        int sumN1N2 = n1 + n2;

        if (sumN1N2 == n3){
            return true;
        }else{
            return false;
        }
    }

}