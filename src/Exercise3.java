import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diamondSet;
        do {
            System.out.println("Enter an odd number bigger then 3: ");
            diamondSet = scanner.nextInt();
        } while (diamondSet <= 3 || diamondSet % 2 != 1);
        int counterForSpaces = 1;
        for (int i = 1; i <= diamondSet; i++) {
            whiteSpace(counterForSpaces, diamondSet);
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            counterForSpaces++;
            i++;
        }
        counterForSpaces -= 2;
        for (int l = (diamondSet-2); l >= 1; l--) {
                whiteSpace(counterForSpaces, diamondSet);
                for (int m = l; m >= 1; m--) {
                    System.out.print("*");
                }
                System.out.println();
                counterForSpaces--;
                l--;
            }
        }
    public static void whiteSpace(int counter, int spacesToPrint) {
        while (counter <= spacesToPrint) {
            System.out.print(" ");
            counter++;
        }
    }

}

