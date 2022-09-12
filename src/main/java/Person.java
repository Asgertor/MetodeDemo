public class Person {
    private double height;
    private int alder;

    public Person(int alder, double height) {
        this.alder = alder;
        this.height = height;

    }

    public double getHeight(){
        return height;
    }
    public int getAlder(){
        return alder;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void hasBirthday() {
        alder ++;
    }

}