class program1_8{
    public static void main(String [] args){
        Byte b=63;
        //byte to string
        String s1=Byte.toString(b);
        System.out.println("bytes to string: "+s1);
        //byte to byte instance
        Byte d=125;
        Byte ba=new Byte(d);
        System.out.println("Byte value to Byte instance: "+ba);

        //string instance to byte instance
        String s2=new String(s1);
        System.out.println(s1);
        Byte bc=new Byte(s1);
        System.out.println("String instance into byte instance: "+bc);
        Syso
       
    }
}





