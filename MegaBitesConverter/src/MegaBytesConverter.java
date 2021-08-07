public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes){

        if (kiloBytes < 0 ){
            System.out.println("Invalid Value");
        } else {

            int kiloToMega = (kiloBytes / 1024);
            int remainder = kiloBytes % 1024;

            System.out.println(kiloBytes +  " KB = " + kiloToMega + " MB and " +  remainder + " KB");
            // " KB = YY MB and ZZ KB
        }
    }

}
