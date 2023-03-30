class program1_21{
    public static void main(String [] args){
        Long l=12L;
        Long l1=new Long(l);
        System.out.println(l1.byteValue());
        System.out.println(l1.intValue());
        System.out.println(l1.floatValue());
        System.out.println(l1.longValue());
        System.out.println(l1.shortValue());
        System.out.println(l1.doubleValue());
    }
}