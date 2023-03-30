import java.util.*;
class program1_11{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        // System.out.println(args[0]);
        System.out.println("Enter Char: ");
        
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            if(Character.isDigit(a.charAt(i))){
                int code_point=a.codePointAt(i);
                System.out.println(code_point);
               
                }
            else{
                if(Character.isUpperCase(a.charAt(i))){
                    System.out.println(Character.toLowerCase(a.charAt(i)));
                    // System.out.println(a.charAt(i).toLowerCase());
                    int code_point=a.codePointAt(i);
                    System.out.println(code_point);
                }
                else{
                    System.out.println(Character.toUpperCase(a.charAt(i)));
                    int code_point=a.codePointAt(i);
                    System.out.println(code_point);
                }
            }

        }
      
        

    }
}