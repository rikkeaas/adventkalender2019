import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class luke1 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/luke1.txt");
        Scanner in = new Scanner(file);
        int total = 0;

        while(in.hasNextLine()) {
            int nb = Integer.parseInt(in.nextLine());
            int fuel = calculateFuel(nb);
            total += fuel;
        }

        System.out.println(total);
    }

    private static int calculateFuel(int nb) {
        return (nb / 3) - 2;

    }


}
