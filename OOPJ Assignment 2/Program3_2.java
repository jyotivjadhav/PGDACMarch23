import java.util.Scanner;
class Bmi{
    private double height;
    private double weight;
    public void setHeight(double H){
        this.height=H;
    }
    public void setWeight(double W){
        this.weight=W;
    }
    public double getHeight() { return height/100; }
    public double getWeight() { return weight; }
    public void calculate_bmi(double height,double weight){
        double bmi1 = weight / (height * height);
        System.out.println("BMI: "+bmi1);
    }
}
class Program3_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Bmi bmi=new Bmi();
        System.out.println("Height in centimeter");
        bmi.setHeight(sc.nextDouble());
        bmi.setWeight(sc.nextDouble());
        bmi.calculate_bmi(bmi.getHeight(),bmi.getWeight());
    }
}