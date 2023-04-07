import java.util.*;
import java.text.*;
class Program3_1{
    public static void main(String [] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int day,month,year,hour,minute,second;
        day=sc.nextInt();
        month=sc.nextInt();
        year=sc.nextInt();
        hour=sc.nextInt();
        minute=sc.nextInt();
        second=sc.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day,hour,minute,second);
        Date date = cal.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat( "dd/mm/yyyy");
        SimpleDateFormat sdf1=new SimpleDateFormat( "mm/dd/yyyy");
        SimpleDateFormat sdf2=new SimpleDateFormat( "yyyy/mm/dd");
        SimpleDateFormat sdf3=new SimpleDateFormat( "hh:mm:ss");
        SimpleDateFormat sdf4=new SimpleDateFormat( "hh:mm:ss");
        SimpleDateFormat sdf5=new SimpleDateFormat( "hh:mm");
        String strDate = sdf.format(date);
        String strDate1 = sdf1.format(date);
        String strDate2 = sdf2.format(date);
        String strDate3 = sdf3.format(date);
        String strDate4 = sdf4.format(date);
        String strDate5 = sdf5.format(date);
        System.out.println("dd/MMMM/yyyy:  "+strDate);
        System.out.println("dd/MMMM/yyyy:  "+strDate1);
        System.out.println("dd/MMMM/yyyy:  "+strDate2);
        System.out.println("hh:mm:ss:      "+strDate3);
        System.out.println("hh:mm:ss:      "+strDate4);
        System.out.println("hh:mm:         "+strDate5);
        System.out.printf("%-15s%-10s\n",strDate,strDate3);
        System.out.printf("%-15s%-10s\n",strDate1,strDate4);
        System.out.printf("%-15s%-10s\n",strDate2,strDate5);
    }
}