import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first element in the sequence: ");
        float firstElement = scanner.nextFloat();
        System.out.println("Please enter the difference between elements in the sequence: ");
        float difference = scanner.nextFloat();
        float elementsAmount;
        do {
            System.out.println("Please enter the wanted number of elements in th sequence. please make sure to insert a natural number: ");
            elementsAmount = scanner.nextFloat();
        } while (elementsAmount <= 0 || elementsAmount % 1 != 0);
        for (int i = 0; i < elementsAmount; i++){
            System.out.print((firstElement + (difference * i)) + "  ");
        }
    }
}
