public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays (long minutes){

        if (minutes <0){
            System.out.println("Invalid Value");
        }else {
            long years = minutes / 525600;
            long days = ((minutes % 525600) / 1440);

            // * printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
            System.out.println(minutes + " min" + " = " + years + " y and " + days + " d");
        }
    }
}