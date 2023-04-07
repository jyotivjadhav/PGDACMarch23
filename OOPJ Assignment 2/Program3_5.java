import java.util.*;
class Telephone_Bill{
    String customerName;
    int Phone_number;
    int Number_of_calls ;
    int Duration;
    Telephone_Bill(){

    }
    public void billAmount(int Number_of_calls,float Duration){
        double Bill;
        int flat_rate=10;
        if(this.Number_of_calls>0 && Number_of_calls<=100){
            Bill=this.Number_of_calls*this.Duration*50+flat_rate;
        }
        else if(this.Number_of_calls>100)
        {
            Bill=this.Number_of_calls*Duration*25+flat_rate;
        }
    }
    public void setConsumerName( String customerName){
        this.customerName=customerName;
    }
    public void setNumber_of_calls( int Number_of_calls){
        this.Number_of_calls=Number_of_calls;
    }
    public void setDuration( int Duration){
        this.Duration=Duration;
    }
    public String getConsumerName(){
        return this.customerName;
    }
    public int getNumber_of_calls(){
        return this.Number_of_calls;
    }
        public int getDuration(){
        return this.Duration;
    }

}
class Program3_5{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        Telephone_Bill tb= new Telephone_Bill();
        System.out.println("Enter consumer name");
        tb.setConsumerName(sc.nextLine());
         System.out.println("Enter number of calls did");
        tb.setNumber_of_calls(sc.nextInt());
         System.out.println("Enter Duration");
        tb.setDuration(sc.nextInt());
        tb.billAmount(tb.getNumber_of_calls(),tb.getDuration());

    }
}