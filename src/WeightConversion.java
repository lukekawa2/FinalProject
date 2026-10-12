import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeightConversion extends Conversion {

    public WeightConversion(int startValue, String startType, String newType)
    {
        Scanner scan = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            weightConverter(scan);
        }
    }
        public static void weightConverter(Scanner scan) {
            System.out.println("How many weights do you want to enter?");
            int count = scan.nextInt();
            // Make it so a person can type in a list of weights all at once instead of typing in each weight one by one
            List<Integer> weights = new ArrayList<>();
            {
                int i = 0;
                while (i < count) {
                    System.out.println("Enter weight" + (i + 1) + ": ");
                    int weight = scan.nextInt();
                    weights.add(weight);
                    System.out.println("Is this the last weight?(y/n)");
                    String contuine = scan.nextLine();
                    if (contuine.equalsIgnoreCase("n")) {
                        System.out.println("Enter weight" + (i + 1) + ": ");
                        weight = scan.nextInt();
                    } else {
                        conversionMath(weight, scan);
                        return;

                    }
                }
            }
        }

        private static void conversionMath (int weight, Scanner scan){
            final String[] weightUnits = {"KG,LBS,Tons"};
            System.out.println("Select a choice from the list" + weightUnits);
            // This is converts the weight
            System.out.println(weightUnits);
            if (weightUnits.equals("KG")) {
                System.out.println("What would you like to convert to? (LBS or Viss)");
                String conversionChoice = scan.nextLine();
                if (conversionChoice == "LBS") {
                    int newWeight = (int) (weight * 2.2046);
                    System.out.println("Weight in LBS is" + newWeight);
                }
            } else {
                int newWeight = (int) (weight * 0.613);
                System.out.println("Weight in Viss is" + newWeight);
            }
            if (weightUnits.toString().equalsIgnoreCase("LBS")) {
                System.out.println("What would you like to convert to? (KG or Viss)");
                String conversionChoice = scan.nextLine();
                if (conversionChoice.toLowerCase().startsWith("k")) {
                    int newWeight = (int) (weight / 2.2046);
                    System.out.println("Weight in LBS is:" + newWeight);
                } else {
                    int newWeight = (int) (weight * 0.2835);
                    System.out.println("Weight in Viss is:" + newWeight);
                }

            }
            if (weightUnits.equals("Tons")) {
                System.out.println("What would you like to convert to? (KG or LBS)");
                String conversionChoice = scan.nextLine();
                if (conversionChoice.toLowerCase().startsWith("k")) {
                    int newWeight = (int) (weight /1000);
                    System.out.println("Weight in KG is:" + newWeight);
                } else {
                    int newWeight = (int) (weight /2000);
                    System.out.println("Weight in LBS is:" + newWeight);
                }
            }

        }




    }
