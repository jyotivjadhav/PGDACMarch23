class program1_30{
    public static void main(String [] args){
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        Double d=22d;
        Double dd=55d;
        Double minimum=Double.min(d,dd);
        Double maximum=Double.max(d,dd);
        Double a=Double.sum( d, dd);
        System.out.println("minimum: "+minimum);
        System.out.println("maximum: "+maximum);
        System.out.println("sum: "+a);
    }
}