public class WeightConversion extends Conversion {

    public WeightConversion(double startValue, String startType, String newType) {
        super(startValue, startType, newType);
    }
    //
    public double convert() {
        //to prevent users from trying to convert to the same type, bc I'm pretty sure that would break the code
        if (startType.equalsIgnoreCase(newType)){
            System.out.println("Can't convert to same type, please select a different type to convert to");
        }

        switch (startType.toLowerCase()) {
            case "kgs":
                if (newType.equalsIgnoreCase("lbs"))
                    newValue =  startValue * 2.2046;
                else if (newType.equalsIgnoreCase("tons"))
                    newValue = startValue / 1000;
                break;
            case "lbs":
                if (newType.equalsIgnoreCase("kgs"))
                    newValue = startValue / 2.2046;
                else if (newType.equalsIgnoreCase("tons"))
                    newValue = startValue / 2000;
                break;
            case "tons":
                if (newType.equalsIgnoreCase("kgs"))
                    newValue = startValue * 1000;
                else if (newType.equalsIgnoreCase("tons"))
                    newValue = startValue * 2000;
                break;
        }
        return newValue;
    }
}







