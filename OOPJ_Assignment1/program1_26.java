class program1_26{
    public static void main(String [] args){
        Float d=10.2f;
        Float dd=5.5f;
        Float minimum=Float.min(d,dd);
        Float maximum=Float.max(d,dd);
        Float a=Float.sum( d, dd);
        System.out.println("minimum: "+minimum);
        System.out.println("maximum: "+maximum);
        System.out.println("sum: "+a);
    }
}