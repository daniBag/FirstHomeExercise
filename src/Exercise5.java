import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkParameter = 0;
        int nextElement = 1;
        int sumHolder;
        System.out.println("Please enter your number to check if it's part of Fibonacci's sequence: ");
        int requestedNumber = scanner.nextInt();
        while (requestedNumber != checkParameter && checkParameter <= requestedNumber){
            sumHolder = checkParameter + nextElement;
            checkParameter = nextElement;
            nextElement = sumHolder;
        }
        if (requestedNumber == checkParameter) {
            System.out.println("Success!! your number (" + requestedNumber + ") is a part of the famous Fibonacci's sequence! :)");
        } else {
            System.out.println("Too bad!! your number (" + requestedNumber + ") is not a part of the famous Fibonacci's sequence! :(");
        }
    }
}

