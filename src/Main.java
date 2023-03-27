import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the quantity of coins");
        int quantityOfCoins = in.nextInt();
        int[] coinArray = new int[quantityOfCoins];
        int pawn = 0;
        fillArray(quantityOfCoins,coinArray);

        printArray(coinArray);
        System.out.println("\n We need to turn only "+ findToCoinsTurn(pawn, coinArray) + " coins");
    }

    public static void fillArray(int quantityOfCoins, int[] coinArray) {
        Random randoms = new Random();
        for (int i = 0; i < quantityOfCoins; i++) {
            coinArray[i] = randoms.nextInt(0,2);
        }
    }
    public static int findToCoinsTurn(int pawn, int[] coinArray) {
        for(int i = 0;i < coinArray.length; i++){
            pawn += coinArray[i];
        }
        if(pawn > coinArray.length - pawn){
            pawn = coinArray.length - pawn;
        }
        return pawn;
    }
    public static  void printArray(int[] coinArray){
        for(int i = 0; i < coinArray.length; i++){
            System.out.print(coinArray[i] + " ");
        }

    }

}