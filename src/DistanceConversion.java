public class DistanceConversion extends Conversion {
    public DistanceConversion(double startValue, String startType) {
        super(startValue, startType, newType);
    }
//Does the conversion math to get miles to km or vice versa. Using if statement because there is only two types so no need for a switch
    public void convert() {
        if  (startType.equalsIgnoreCase(newType)){
            System.out.println("Can't convert to same type, please select a different type to convert");
        }

        if (startType.equalsIgnoreCase("miles")) {
            newType = startValue * 1.609344;
        } else if (startType.equalsIgnoreCase("km")) {
            newValue = startValue * 0.62137119;
        }
    }

}
