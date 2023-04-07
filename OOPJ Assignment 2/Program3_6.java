import java.util.Scanner;
class Bank_Account{
    String Account_name;
    long Aadhar;
    double Account_balace;
    int age;
    static long Account_Number=51200;
    Scanner sc=new Scanner(System.in);
    //setter
    public void setAccount_Age(int age){
        this.age=age;
    }
    public void setAccount_name(String Account_name){
        this.Account_name=Account_name;
    }
    public void setAccount_number(long Account_Number){
        this.Account_Number=Account_Number;
    }

    public void setAccount_balace(double Account_balace){
        this.Account_balace=Account_balace;
    }
    public void setAadharNumber(long Aadhar){
        this.Aadhar=Aadhar;
    }
    //getter
    public String getAccount_name(){
        return  this.Account_name;
    }
    public long getAadharNumber(){
        return this.Aadhar;
    }
    public int getage(){
        return  this.age;
    }
    public long getAccount_number(){
        return this.Account_Number;
    }
    public double getAccount_balace(){
        return this.Account_balace;
    }
    public void create_Account(){
        setAccount_number(this.Account_Number);
        System.out.println("Your Account Number is: "+getAccount_number());
        this.Account_Number++;
        setAccount_balace(0);
        System.out.println("Your Balance  is: "+getAccount_balace());
        System.out.println("Your Aadhar Number  is: "+getAadharNumber());
        System.out.println("Your Age  is: "+getage());
    }
      public void Deposit_money(){
        System.out.println("Enter Account number");
        Long Account=sc.nextLong();
        System.out.println("Account"+Account);
        System.out.println("Enter Amount to deposit");
        double amount=sc.nextDouble();
        Long ACN=getAccount_number();
        System.out.println("ACN"+ACN);
        if(ACN==(Account+1)){
            double balance=getAccount_balace();
            balance+=amount;
            setAccount_balace(balance);
            System.out.println("Amount Deposited");
        }
        else{
            System.out.println("Account Number does not match");
        }
        
    }
      public void Withdraw_money(){
        System.out.println("Enter Account number");
        int Account=sc.nextInt();
        System.out.println("Enter Amount to widraw");
        double amount_w=sc.nextDouble();
        double balance=getAccount_balace();
        Long ACN=getAccount_number();
        if(ACN==Account+1){
            if(amount_w>getAccount_balace()){
                System.out.println("Insufficient balance");
            }
            else{
                balance-=amount_w;
                setAccount_balace(balance);
                System.out.println("Your Balance  is: "+getAccount_balace());
            }
           
        }
        else{
            System.out.println("Account Number does not match");
        }
        
    }
      public void Display_Balance(){
        System.out.println("Enter Account number");
        Long Account=sc.nextLong();
        Long ACN=getAccount_number();
        if(ACN==Account+1){
           
            System.out.println("YOUR BALANCE IS: "+getAccount_balace());
        }
        else{
            System.out.println("Account Number does not match");
        }
        
    }
      public void show_Account_info(){
        System.out.println("Enter Account number");
        Long Account=sc.nextLong();
        Long ACN=getAccount_number();
        if(ACN==Account+1){
            System.out.println("YOUR BALANCE IS: "+getAccount_name());
           System.out.println("Account number"+getAccount_name() +":"+getAccount_balace());
            System.out.println("YOUR BALANCE IS: "+getAadharNumber());
        }
        else{
            System.out.println("Account Number does not match");
        }
        
    }
    public int Menulist(){
        System.out.println("\n0.Exit");
        System.out.println("1.Create a new account");
        System.out.println("2.Deposit money into an account");
        System.out.println("3.Withdraw money from an account");
        System.out.println("4.Display the account balance");
        System.out.println("5.Display the account holder's information");
        System.out.println("6.Enter Choice ");
        return sc.nextInt();
    }
}
class Program3_6{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        Bank_Account ba=new Bank_Account();
        int choice;
        while((choice=ba.Menulist())!=0){
            switch(choice){
                case 1:sc.nextLine();
                    System.out.println("Enter Account holder's name");
                    String name=sc.nextLine();
                    ba.setAccount_name(name);
                    System.out.print("Enter Your Age: ");
					int age=sc.nextInt();
                    ba.setAccount_Age(age);
                    System.out.print("Enter Your Aadhar Number: ");
					long Aadhar=sc.nextLong();
                    ba.setAadharNumber(Aadhar);
                    ba.create_Account();
                    break;
                case 2:ba.Deposit_money();
                    break;
                case 3:ba.Withdraw_money();
                    break;
                case 4:ba.Display_Balance();
                    break;
                case 5:ba.show_Account_info();
                    break;
                case 6:System.out.println("exit");
                    break;    
            }
        }

    }
}