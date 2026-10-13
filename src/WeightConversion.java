public class WeightConversion extends Conversion {

    public WeightConversion(int startValue, String startType, String newType) {
        super(startValue, startType, newType);
    }

    public void convert() {
        switch (startType.toLowerCase()) {
            case "kg":
                if (newType.equalsIgnoreCase("lb"))
                    newValue =  startValue * 2.2046;
                else if (newType.equalsIgnoreCase("tons"))
                    newValue = startValue / 1000;
                break;
            case "lb":
                if (newType.equalsIgnoreCase("kg"))
                    newValue = startValue / 2.2046;
                else if (newType.equalsIgnoreCase("tons"))
                    newValue = startValue / 2000;
                break;
            case "tons":
                if (newType.equalsIgnoreCase("kg"))
                    newValue = startValue * 1000;
                else if (newType.equalsIgnoreCase("tons"))
                    newValue = startValue * 2000;
                break;
        }
    }
}







