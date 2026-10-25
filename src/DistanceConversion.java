public class DistanceConversion extends Conversion {
    public DistanceConversion(double startValue, String startType) {
        super(startValue, startType, null);
    }
//Does the conversion math to get miles to km or vice versa. Using if statement because there is only two types so no need for a switch
    public double convert() {

        if (startType.equalsIgnoreCase("miles")) {
            newValue = startValue * 1.609344;
        } else if (startType.equalsIgnoreCase("km")) {
            newValue = startValue * 0.62137119;
        }
        return newValue;
    }


}
