class program1_24{
    public static void main(String args[]) {  

        Float c=78F;
        String s=String.valueOf(c);
        System.out.println(s);
        Float st=new Float(c);
        System.out.println(st);
        String s2=new String(s);
        Float v=new Float(s2);
        System.out.println(s2);
        System.out.println(v);
        System.out.println(Float.toHexString(c));
        

    } 

}