import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diamond;
        do {
            System.out.println("Enter an odd number bigger then 3: ");
            diamond = scanner.nextInt();
        } while (diamond <= 3 || diamond % 2 != 1);
        int counterForSpaces = 1;
        for (int i = 1; i <= diamond; i++) {
            whiteSpace(counterForSpaces, diamond);
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            counterForSpaces++;
            i++;
        }
        counterForSpaces -= 2;
        for (int l = (diamond-2); l >= 1; l--) {
                whiteSpace(counterForSpaces, diamond);
                for (int m = l; m >= 1; m--) {
                    System.out.print("*");
                }
                System.out.println();
                counterForSpaces--;
                l--;
            }
        }
    public static void whiteSpace(int k, int space) {
        while (k <= space) {
            System.out.print(" ");
            k++;
        }
    }

}

