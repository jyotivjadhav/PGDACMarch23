class program1_20{
    public static void main(String args[]) {  

        Long c=78L;
        String s=String.valueOf(c);
        System.out.println(s);
        Long st=new Long(c);
        System.out.println(st);
        String s2=new String(s);
        Long v=new Long(s2);
        System.out.println(s2);
        System.out.println(v);
        System.out.println(Long.toOctalString(c));
        System.out.println(Long.toHexString(c));
        System.out.println(Long.toBinaryString(c));
        

    } 

}