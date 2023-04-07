import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.DayOfWeek;
class date{
    int day;
    int month;
    int year;
}
class date_test{
  
    public boolean isValid(Calendar rightNow){
        int year=rightNow.get(rightNow.YEAR);
        int month=rightNow.get(rightNow.MONTH);
        int day=rightNow.get(rightNow.DAY_OF_MONTH);

        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);  
        calendar.set(year, month, day, 0, 0, 0);  
    try {  
        rightNow.getTime();  
        return true;  
     } catch (Exception e) {  
        return false;  
     }  
    }
    public void  getDayOfWeek(Calendar rightNow){

            String [] days=new String[]{"sunday","monday","tuesday","wednesday","Thurseday","Friday","Saturday","sunday"};
            int day = rightNow.get(rightNow.DAY_OF_WEEK );
            System.out.println("day "+(days[day-1]));

    }
    public void isLeapYear(int year){
        // int year=rightNow.get(Calendar.YEAR);
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Leap year:"+"true");
        }
        else{
            System.out.println("Leap year:"+"false");
        }
    }
    public void getNextDay(Calendar rightNow){
        SimpleDateFormat sdf=new SimpleDateFormat( "dd-MM-yyyy");
        rightNow.add(rightNow.DAY_OF_WEEK,1);
        int a=rightNow.get(rightNow.YEAR);
        int b=rightNow.get(rightNow.MONTH);
        int c=rightNow.get(rightNow.DAY_OF_MONTH);
        Date date = rightNow.getTime();
        String strDate = sdf.format(date);
        System.out.println("nextDay: "+strDate);
    }
    public void getPreviousDay(Calendar rightNow){
     
        SimpleDateFormat sdf=new SimpleDateFormat( "dd-MM-yyyy");
        rightNow.add(rightNow.DAY_OF_MONTH,-1);
        int a=rightNow.get(rightNow.YEAR);
        int b=rightNow.get(rightNow.MONTH);
        int c=rightNow.get(rightNow.DAY_OF_MONTH);
        Date date =rightNow.getTime();
        String strDate = sdf.format(date);
        System.out.println("previousDay: "+strDate);
       

    }
}
class Program{
    public static void main(String args []){
        date_test dt=new date_test();
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(2022,12-1,31);
        System.out.println(rightNow.getTime());
        boolean dv=dt.isValid(rightNow);
        System.out.println("validity od date: "+dv);
        dt.getDayOfWeek(rightNow);
        dt.isLeapYear(Calendar.YEAR);
        dt.getNextDay(rightNow);
        dt.getPreviousDay( rightNow);
    }
}