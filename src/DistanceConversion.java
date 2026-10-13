public class DistanceConversion extends Conversion {
    public DistanceConversion (double startValue, String startType, String newType) {
        super(startValue, startType, newType);
    }
    public void convert(){
        switch (startType.toLowerCase()) {
            case "km":
                newValue = (startValue * .621371);
                break;
            case "miles":
                newValue = (startValue * 1.609344);
        }
    }
}
