class program1_33{
    public static void sum(int i, double d, float f ){
        System.out.println(i+f+d);
    }

    public static void diff(int i, double d, float f ){
        System.out.println(i-f-d);
    }

    public static void multi(int i, double d, float f ){
        System.out.println(i*f*d);
    }

    public static void main(String [] args){
        Integer i = Integer.parseInt(args[0]);
        Float f = Float.parseFloat(args[1]);
        Double d = Double.parseDouble(args[2]);
        String s = args[3];
        

        switch (s) {
            case "sum": sum(i,d,f);
            break;
            case "diff": diff(i,d,f);
            break;
            case "multi": multi(i,d,f);
            break;
            default : System.out.println("No match found");
            }
    
    }
    
}