public abstract class Conversion {
    protected int startValue;
    protected String startType;
    protected String newType;
    protected int newValue;

    public Conversion(int startValue, String startType, String newType){
        this.startValue = startValue;
        this.startType = startType;
        this.newType = newType;
    }

    public double getStartValue(){return startValue;}
    public String getStartType(){return startType;}
    public String getNewType(){ return newType;}
    public int getNewValue(){return newValue;}

    public void setStartValue(int) {this.startValue = v;}
    public void setStartType(String startType) {this.startType = t;}
    public void setNewType(String newType) {this.newType = t;}


    public abstract void convert();
}
