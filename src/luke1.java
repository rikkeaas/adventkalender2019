import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class luke1 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/luke1.txt");
        Scanner in = new Scanner(file);
        int total = 0;
        int totalAccumulated = 0;

        while(in.hasNextLine()) {
            int nb = Integer.parseInt(in.nextLine());
            int fuel = calculateFuel(nb);
            total += fuel;
            int fuelAccumulated = calculateFuelAccumulated(nb);
            totalAccumulated += fuelAccumulated;
        }

        System.out.println(total);
        System.out.println(totalAccumulated);
    }

    private static int calculateFuel(int nb) {
        return (nb / 3) - 2;

    }

    private static int calculateFuelAccumulated(int nb) {
        int accumulatedFuel = 0;
        int currFuel = calculateFuel(nb);

        while (currFuel > 0) {
            accumulatedFuel += currFuel;
            currFuel = calculateFuel(currFuel);
        }

        return accumulatedFuel;
    }


}
