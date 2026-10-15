import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        choiceSelection();
    }

        //This is supposed to ask the user if they would like to upload a file instead of doing one conversion at a time
        //Also not sure where I would put upload think it would go into choice selection
        public static void upload () {
            IO.println("Would you like to upload a file?(y/n)");
            String selection = IO.readln();
            if (selection.equals("y")) {
                fileHandler(); //not sure if I would need a switch here asking what file type it is? But I think fileHandler class will handle all files?
            } else {
                choiceSelection();
            }

        }

        private static void choiceSelection () {
            int choice = 0;
            while (true) {
                System.out.println("""
                        Hello which option would you like to select?
                        \t1. Distance Converter
                        \t2. Weight Converter
                        \t3. Money Converter
                        \t4. Read From External File
                        """);
                choice = IO.readln(choice);
                IO.readln();
                if (choice <= 4 && choice >= 1) {
                    System.out.println("Please choose from the listed options");
                    switch (choice) {
                        case 1:
                            distanceConverter();
                        case 2:
                            weightConverter();
                        case 3:
                            moneyConverter();
                        case 4:
                            fileHandler();
                    }
                }
            }

        }
//Gets the user inputs, then the seperate classes use these inputs to do the correct conversion math
        private static void distanceConverter () {
            System.out.println("What is your start value?");
            double startValue;
            startValue = IO.readln(startValue);

            System.out.println("Is start type Miles or KM?");
            String startType ="";
            startType = IO.readln(startType);

            DistanceConversion dc = new DistanceConversion(startValue, startType);
            dc.convert();

        }

        private static void weightConverter () {
            System.out.println("What is your start value?");
            double startValue = IO.readln(startValue);

            System.out.println("Is this in LBS, KGS, or Tons?");
            String startType = "";
            startType = IO.readln(startType);

            System.out.println("Convert to LBS, KGS, or Tons?");
            String newType = "";
            newType = IO.readln(newType);

            WeightConversion wc = new WeightConversion(startValue, startType, newType);
            wc.convert();
        }

        private static void moneyConverter () {
            System.out.println("What is your start value?");
            double startValue = IO.readln(startValue);

            System.out.println("Is this in USD, British Pounds, or Euros?");
            String startType = "";
            startType = IO.readln(startType);

            System.out.println("Convert to USD,  British Pounds, or Euros?");
            String newType = "";
            newType = IO.readln(newType);

            MoneyConversion mc = new MoneyConversion(startValue, startType, newType);
            mc.convert();

        }
        private static void fileHandler() {
        }

    }


