import java.util.Calendar;
class Program3_1{
    public static void main(String [] args){
    Calendar c =  Calendar.getInstance();
    int day = c.get( Calendar.DATE );
    int month = c.get( Calendar.MONTH ) + 1;
    int year = c.get( Calendar.YEAR ); 
    int hour =c.get(Calendar.HOUR);
    int minut =c.get(Calendar.MINUTE);
    int second =c.get(Calendar.SECOND);
    System.out.println(day+" "+month+" "+year+" "+hour+" "+minut+" "+second);
    
    }
}