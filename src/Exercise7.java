public class Exercise7 {
    public static int howManyDigits (int checkNum){
        int digitsCounter = 0;
        while (checkNum > 0){
            checkNum /= 10;
            digitsCounter++;
        }
        return digitsCounter;
    }
    public static int powerNumber (int base, int expo){
        int result = 1;
        for (int i = 1; i <= expo; i++){
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        int onesDigit;
        int upgradedDigitSum;
        int digitsNumber;
        int currentNumber;
        System.out.println("Start!");
        for (int i = 1; i <= 1000; i++){
            digitsNumber = howManyDigits(i);
            currentNumber = i;
            upgradedDigitSum = 0;
            while (currentNumber > 0){
                onesDigit = currentNumber % 10;
                upgradedDigitSum += powerNumber(onesDigit, digitsNumber);
                currentNumber /= 10;
            }
            if (upgradedDigitSum == i){
                System.out.println(i);
            }
        }
        System.out.println("End.");
    }
}
