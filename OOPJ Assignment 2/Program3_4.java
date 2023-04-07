import java.util.Scanner;
class Electricity_Bill{
    String customerName;
    double unitsConsumed;
    double billAmount;
    Electricity_Bill(){
        this.customerName="None";
        this.unitsConsumed=0.0;
    }
    Electricity_Bill(String customerName,double unitsConsumed){
        this.customerName=customerName;
        this.unitsConsumed=unitsConsumed;

    }
    public void setConsumerName( String customerName){
        this.customerName=customerName;
    }
    public void setUnitsConsumed(double unitsConsumed){
        this.unitsConsumed=unitsConsumed;
    }
    public String getConsumerName(){
        return this.customerName;
    }
    public double getUnitsConsumed(){
        return this.unitsConsumed;
    }
    public double calculateBillAmount(double unitsConsumed){
        double billAmount;
        if(this.unitsConsumed>0 && this.unitsConsumed<=100){
             billAmount=this.unitsConsumed*5;
        }
        else if(this.unitsConsumed>100 && this.unitsConsumed<=200){
             billAmount=this.unitsConsumed*7;
        }
        else{
             billAmount=this.unitsConsumed*10;
        }
        return billAmount;
    }
}
class Program3_4{
    public static void main(String args []){
        Electricity_Bill e =new Electricity_Bill();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter ConsumerName");
        e.setConsumerName(sc.nextLine());
        System.out.println("Enter Units Consumed");
        e.setUnitsConsumed(sc.nextInt());
        e.getConsumerName();
        e.getUnitsConsumed();     
        double Electric_Bill=e.calculateBillAmount(e.getUnitsConsumed());
        System.out.println("Electric_Bill= "+Electric_Bill);



    }
}