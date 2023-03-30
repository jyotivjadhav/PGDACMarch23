class program1_22{
    public static void main(String [] args){
        Long d=105l;
        Long dd=55l;
        Long minimum=Long.min(d,dd);
        Long maximum=Long.max(d,dd);
        Long a=Long.sum( d, dd);
        System.out.println("minimum: "+minimum);
        System.out.println("maximum: "+maximum);
        System.out.println("sum: "+a);
    }
}