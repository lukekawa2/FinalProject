import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
                if (choice >= 3 || choice <= 1) {
                System.out.println("Please choose from the listed options");
                if (choice == 1){
                    distanceConverter}
                if (choice==2){
                    weightConverter();}
                else moneyConverter;

                }
        }
        System.out.println("Would you like to make another conversion (y/n)");
        String conChoice = scan.nextLine();
        if (conChoice .equalsIgnoreCase("yes")){
            choiceSelection();
        } else {
            System.out.println("Goodbye!");
        }

    }

    private static void weightConverter() {
    System.out.println("What is the starting weight of your item?");
    int weight = scan.nextInt();
        List<String> weightUnits = new ArrayList<>(Integer.parseInt("KG,LBS,Viss"));
    System.out.println("Select a choice from the list:");
    System.out.println(weightUnits);
    String weightUnits =
    if (weightUnit == "KG"){
        System.out.println("What would you like to convert to? (LBS or Viss)");
        String conversionChoice = scan.nextLine();
        if (conversionChoice == "LBS") {
          int newWeight = (int) (weight *2.2046);
          System.out.println("Weight in LBS is" + newWeight);
        }
    } else {
        int newWeight = (int) (weight * 0.613 );
        System.out.println("Weight in Viss is" + newWeight);
    }
    if (weightUnit == "LBS"){
        System.out.println("What would you like to convert to? (KG or Viss)");
        String conversionChoice = scan.nextLine();
        if (conversionChoice .startsWith().equalsIgnorCase("k")){
            int newWeight = (int) (weight/2.2046);
            System.out.println("Weight in LBS is:" + newWeight);
        } else {
            int newWeight = (int) (weight * 0.2835);
            System.out.println("Weight in Viss is:" + newWeight);
        }

    }
    if (weightUnit == "Viss"){
        System.out.println("What would you like to convert to? (KG or LBS)");
            String conversionChoice = scan.nextLine();
            if (conversionChoice .startsWith(conversionChoice).equalsIgnoreCase("k")){
                int newWeight = (int) (weight * 1.6);
                System.out.println("Weight in KG is:" + newWeight);
            } else {
                int newWeight = (int) (weight * 3.527);
                System.out.println("Weight in LBS is:" + newWeight);
            }

    }
    }

}


