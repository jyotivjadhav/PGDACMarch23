
import java.util.Scanner;
class Credit_Score{
    int creditHistory;
    double creditUtilization;
    boolean paymentHistory;

    Credit_Score(){
        // this.creditHistory = 0;
        // this.creditUtilization = 0.0;
        // this.paymentHistory = false;
    }
    public int getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }

    public double getCreditUtilization() {
        return creditUtilization;
    }

    public void setCreditUtilization(double creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    public boolean isPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(boolean paymentHistory) {
        this.paymentHistory = paymentHistory;
    }
    public int calculateCreditScore() {
        int creditScore = (creditHistory * 15) + (int)(creditUtilization * 30);
        if (paymentHistory) {
            creditScore += 55;
        } else {
            creditScore += 35;
        }
        return creditScore;
    }

}

class Program3_10{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Credit_Score cs = new Credit_Score();
        System.out.print("Enter Credit History: ");
        cs.setCreditHistory(sc.nextInt());
        System.out.print("Enter Credit Utilization: ");
        cs.setCreditUtilization(sc.nextDouble());
        System.out.print("Enter Payment History (true or false): ");
        boolean paymentHistory = sc.nextBoolean();
        cs.setPaymentHistory(paymentHistory);

        System.out.println("Credit Score is : " + cs.calculateCreditScore());
    }
}