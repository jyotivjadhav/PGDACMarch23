class program1_16{
    public static void main(String args[]) {  
       
        Integer c=89;
        String s=String.valueOf(c);
        System.out.println(s);
        Integer st=new Integer(c);
        System.out.println(st);
        String s2=new String(s);
        Integer v=new Integer(s2);
        System.out.println(s2);
        System.out.println(v);


    } 

}