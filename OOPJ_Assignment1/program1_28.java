class program1_28{
    public static void main(String args[]) {  

        Double c=752d;
        String s=String.valueOf(c);
        System.out.println(s);
        Double st=new Double(c);
        System.out.println(st);
        String s2=new String(s);
        Double v=new Double(s2);
        System.out.println(s2);
        System.out.println(v);
        Long v2 = Double.doubleToLongBits(c);

        System.out.println(Long.toOctalString(v2));
        System.out.println(Double.toHexString(c));
        System.out.println(Long.toBinaryString(v2));
        

    } 

}