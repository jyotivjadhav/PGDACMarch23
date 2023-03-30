class program1_13{
    public static void main(String args[]) {  
        // String str = null;
        // System.out.println(String.valueOf(str));  // This will print a String equal to "null"        
        // System.out.println(str.toString()); // This will throw a NullPointerException
        short c=78;
        String s=String.valueOf(c);
        System.out.println(s);
        Short st=new Short(c);
        System.out.println(st);
        String s2=new String(s);
        Short v=new Short(s2);
        System.out.println(s2);
        System.out.println(v);


    } 

}