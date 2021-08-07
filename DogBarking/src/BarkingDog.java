public class BarkingDog {

    //true, 4
    public static boolean shouldWakeUp(boolean barking, int hourDay) {
        if (hourDay > 8 && hourDay < 22){
            return false;

        }else return barking && hourDay <= 8 && hourDay >= 0 || barking && hourDay >= 22 && hourDay <= 24;


    }
}
