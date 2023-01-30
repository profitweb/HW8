import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        double[] weights = new double[10];
        double midleweight = 0;
        int peapleCount = 0;

        for ( int i = 0; i < weights.length; i++) {
            weights[i] = ( new Random().nextDouble() * 60 ) + 40;
        }

        for ( int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
            midleweight += weights[i] / weights.length;
            if (weights[i] >= 60 && weights[i] <= 80) {
                peapleCount++;
            }
        }
        System.out.println("/////////////////");

        System.out.println("midle weight of all employees is " + midleweight);
        System.out.println("we have " +peapleCount + "  oldest peaple.");

    }
}
