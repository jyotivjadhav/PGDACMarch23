import java.lang.*;
class program1_6{
    public static void main(String [] args){
        boolean b1=true;
        String s2=Boolean.toString(b1);// The toString() is the static method of Boolean class
        System.out.println("boolean value into String: "+s2);
        Boolean val=true;
        Boolean bp= new Boolean(val);//boolean value into Boolean instance.
        System.out.println("boolean value into Boolean instance: "+bp);
        String s3="true";
        String s4="HI";
        Boolean bv=Boolean.valueOf(s3);//string into boolean
        Boolean bv1=Boolean.valueOf(s4);
        System.out.println("string to booolean: "+bv);
        System.out.println("string to booolean111: "+bv1);
        String abc="Hello World";
        Boolean bd=new Boolean(abc);//String into boolean instance value
        System.out.println(bd);
    }

}