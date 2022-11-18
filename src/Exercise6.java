import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numberToCalculate;
        do {
            System.out.println("please enter a whole number: ");
            numberToCalculate = scanner.nextFloat();
        } while (numberToCalculate %1 != 0);
        if (numberToCalculate < 0){
            numberToCalculate = (numberToCalculate * -1);
        }
        int digitSum = 0;
        while (numberToCalculate > 0){
            digitSum += numberToCalculate % 10;
            numberToCalculate = (int)(numberToCalculate/10);
        }
        System.out.println(digitSum);
    }
}

