public class AreaCalculator {



    public static double  area ( double radius){

        if (radius <= -1){
            return -1 ;
        }
        double circArea = (radius * radius) * Math.PI;
        return circArea;
    }
    public static double  area ( double x, double y){

        if (x <= -1 || y <= -1){
            return -1 ;
        }
        double rectArea = x * y;
        return rectArea;
    }

}