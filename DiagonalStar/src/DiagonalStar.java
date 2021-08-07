public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }


        for (int column = 1; column == number; column++) {
            for (int line = 1; line == number; line++) {
                if (line == 1){
                    System.out.print("*");
                    if (line == number){
                        System.out.print("*");
                    }
                    if (column == 1){
                        System.out.print("*");
                    }
                    if (column == number){
                        System.out.print("*");

                    }
                    if (column == line){
                        System.out.print("*");

                    }
                    if (column)
                    if (line == number){
                        System.out.println("");
                    }
                }

            }

        }



    }

}
