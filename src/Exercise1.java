import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first parameter: ");
        double aPar = scanner.nextFloat();
        System.out.println("Please enter the second parameter: ");
        double bPar = scanner.nextFloat();
        System.out.println("Please enter the third parameter: ");
        double cPar = scanner.nextFloat();
        double delta = (bPar * bPar)-(4 * aPar * cPar));
        if (delta > 0) {
            double sr = Math.sqrt(delta);
            double xFirst = (((-1) * bPar) + sr) / (2 * aPar);
            double xSecond = (((-1) * bPar) - sr) / (2 * aPar);
            System.out.println("There are 2 available solutions: " + xFirst + " and " + xSecond);
        } else if (delta == 0) {
            System.out.println("There is only one available solution: " + (((-1) * bPar) / (2 * aPar)));
        } else {
            System.out.println("Unfortunately, there are no available solutions.");
        }
    }
}
