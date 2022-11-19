import java.util.Scanner;

public class Exercise4 {
    public static int getAmount(){
        Scanner scanner = new Scanner(System.in);
        float desiredAmount;
        do {
            System.out.println("Please enter the desired amount of primary numbers: ");
            desiredAmount = scanner.nextFloat();
        } while (desiredAmount <= 0 || desiredAmount % 1 != 0);
        return (int)desiredAmount;
    }
    public static boolean checkIfPrimaryAndPrint (int checkNum){
        boolean check = true;
        for (int i = 2; i < checkNum; i++){
            if (checkNum % i == 0){
                check = false;
                break;
            }
        }
        if (check){
            System.out.println(checkNum);
        }
        return check;
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
