import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import


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
                    \t4. Read From External File
                    """);
            choice = scan.nextInt();
            scan.nextLine();
                if (choice <= 4 && choice >= 1) {
                System.out.println("Please choose from the listed options");
                switch (choice){
                    case 1: distanceConverter();
                    case 2: weightConverter();
                    case 3: moneyConverter();
                    case 4: fileHandler();
                }
                }
        }

    }

    private static void distanceConverter() {
        System.out.println("What is your start value?");
        double startValue = scan.nextDouble();

        System.out.println("Is start type Miles or KM?");
        String startType = scan.next();

        DistanceConversion dc = new DistanceConversion(startValue, startType);
        dc.convert();

    }

    private static void weightConverter() {
        System.out.println("What is your start value?");
        double startValue = scan.nextDouble();

        System.out.println("Is this in LBS, KGS, or Tons?");
        String startType = scan.next();

        System.out.println("Convert to LBS, KGS, or Tons?");
        String newType = scan.next();

        WeightConversion wc = new WeightConversion(startValue, startType, newType);
        wc.convert();
    }

    private static void moneyConverter() {
        System.out.println("What is your start value?");
        double startValue = scan.nextDouble();

        System.out.println("Is this in USD, British Pounds, or Euros?");
        String startType = scan.next();

        System.out.println("Convert to USD,  British Pounds, or Euros?");
        String newType = scan.next();

        MoneyConversion mc = new MoneyConversion(startValue, startType, newType);
        mc.convert();

    }

        }


