import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first parameter: ");
        double aParameter = scanner.nextFloat();
        System.out.println("Please enter the second parameter: ");
        double bParameter = scanner.nextFloat();
        System.out.println("Please enter the third parameter: ");
        double cParameter = scanner.nextFloat();
        double delta = (bParameter * bParameter)-(4 * aParameter * cParameter);
        if (delta > 0) {
            double squareRoot = Math.sqrt(delta);
            double xFirst = (((-1) * bParameter) + squareRoot) / (2 * aParameter);
            double xSecond = (((-1) * bParameter) - squareRoot) / (2 * aParameter);
            System.out.println("There are 2 available solutions: " + xFirst + " and " + xSecond);
        } else if (delta == 0) {
            System.out.println("There is only one available solution: " + (((-1) * bParameter) / (2 * aParameter)));
        } else {
            System.out.println("Unfortunately, there are no available solutions.");
        }
    }
}

