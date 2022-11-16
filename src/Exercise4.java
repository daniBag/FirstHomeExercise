import java.util.Scanner;

public class Exercise4 {
    public static boolean checkIfPrimaryAndPrint (int x){
        boolean check = true;
        for (int i = 2; i < x; i++){
            if (x % i == 0){
                check = false;
                break;
            }
        }
        if (check){
            System.out.println(x);
        }
        return check;
    }
    public static int getAmount(){
        Scanner scanner = new Scanner(System.in);
        int desiredAmount;
        do {
            System.out.println("Please enter the desired number of primary numbers: ");
            desiredAmount = scanner.nextInt();
        } while (desiredAmount <= 0);
        return desiredAmount;
    }

    public static void main(String[] args) {
        int desiredAmount = getAmount();
        int checkNum = 2;
        int printedCounter = 0;
        do {
            if (checkIfPrimaryAndPrint(checkNum)){
                printedCounter++;
            }
            checkNum++;
        } while (printedCounter != desiredAmount);
    }
}
