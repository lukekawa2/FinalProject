import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        choiceSelection();
    }

    private static void choiceSelection() {
        int choice = 0;
        while (true) {
            System.out.println("""
                    Hello which option would you like to select?
                    \t1. Distance Converter
                    \t2. Weight Converter
                    \t3. Money Converter
                    """);
            choice = scan.nextInt();
            scan.nextLine();
                if (choice <= 3 && choice >= 1) {
                System.out.println("Please choose from the listed options");
                if (choice == 1) {
                    distanceConverter();
                }
                if (choice==2){
                    WeightConversion.weightConverter(scan);
                }
                if (choice==3){
                    moneyConverter();
                }
                }
        }

    }

    private static void moneyConverter() {
        System.out.println("Replace with partner code");
    }

    private static void distanceConverter() {
        System.out.println("Replace with partner's method");
    }









        }


