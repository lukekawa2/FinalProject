public class MoneyConversion extends Conversion {
    public MoneyConversion(double startValue, String startType, String newType) {
        super(startValue, startType, newType);
    }
    //Converting the value from the orginal type that user specified to the new type that the user wants. Just multiplication
    public void convert() {
        //to prevent users from trying to convert to the same type, bc I'm pretty sure that would break the code
        if  (startType.equalsIgnoreCase(newType)){
            System.out.println("Can't convert to same type, please select a different type to convert");
        }
        switch (startType.toLowerCase()) {
            case "usd":
                if (newType.equals("euro"))
                    newValue = startValue * 0.90;
                else if (newType.equals("pounds"))
                    newValue = startValue * 0.84;
                break;
            case "euro":
                if (newType.equalsIgnoreCase("usd"))
                    newValue = startValue * 1.12;
                else if (newType.equalsIgnoreCase("pounds"))
                    newValue = startValue * 0.85;
                break;
            case "pounds":
                if (newType.equalsIgnoreCase("usd"))
                    newValue = startValue * 1.32;
                else if (newType.equalsIgnoreCase("euro"))
                    newValue = startValue * 1.18;
                break;
        }
    }
}


