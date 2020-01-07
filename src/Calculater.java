import java.util.ArrayList;

public class Calculater {
    private double num1;
    private double num2;
    private Double arr[];

    public double addition(double num1, double num2) {
        this.num1 = num1;
        this.num2 =  num2;
        return this.num1 + this.num2;
    }

    public double substraction(double num1, double num2) {
        this.num1 = num1;
        this.num2 =  num2;
        return this.num1 - this.num2;
    }

    public double division(double num1, double num2) {
        this.num1 = num1;
        this.num2 =  num2;
        return this.num1 / this.num2;
    }

    public double multiplication(double num1, double num2) {
        this.num1 = num1;
        this.num2 =  num2;
        return this.num1 * this.num2;
    }

    public int modulas(double num1, double num2) {
        this.num1 = num1;
        this.num2 =  num2;
        return (int) (this.num1 % this.num2);
    }
    public ArrayList<Double> findLargeAndSmall(Double arr[]){
        this.arr = arr;
        double large = 0;
        double small = 0;
        ArrayList<Double> numList = new ArrayList<>();

        for(int i=0; i<this.arr.length; i++){
            double temp = arr[i];
            if(temp > large){
                large = temp;
            }
            if(temp < small){
                small = temp;
            }
        }

        numList.add(0, small);
        numList.add(1, large);
        return numList;
    }

}
