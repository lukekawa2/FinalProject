public abstract class Conversion {
    protected double startValue;
    protected String startType;
    protected String newType;
    protected double newValue;

    public Conversion(double startValue, String startType, String newType){
        this.startValue = startValue;
        this.startType = startType;
        this.newType = newType;
    }

    public double getStartValue(){return startValue;}
    public String getStartType(){return startType;}
    public String getNewType(){ return newType;}
    public double getNewValue(){return newValue;}

    public void setStartValue(double v) {this.startValue = v;}
    public void setStartType(String t) {this.startType = t;}
    public void setNewType(String n) {this.newType = n;}


    public abstract void convert();
}
