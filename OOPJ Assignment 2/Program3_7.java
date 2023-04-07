import java.util.Scanner;
class Toll_Booth{
    String vehicleType ;
    int Number_of_axles ;
    double Distance;
    double totalAmountDue;
    double tollFee;
    public void setVehicle_type(String vehicleType){
        this.vehicleType = vehicleType;
    }
    public void setNumber_of_axles(int Number_of_axles){
        this.Number_of_axles = Number_of_axles;
    }
    public void setDistance(double Distance){
        this.Distance = Distance;
    }
	public String getVehicle_type(){
		return this.vehicleType;
	}
	public int getNumber_of_axles(){
		return this.Number_of_axles;
	}
	public double getDistance(){
		return this.Distance;
	}
    double calculateTollFee() {

		if(this.vehicleType.equalsIgnoreCase("truck")) {
			this.tollFee = 0.5 * this.Number_of_axles * this.Distance;
		} else if(this.vehicleType.equalsIgnoreCase("car") || this.vehicleType.equalsIgnoreCase("van") || this.vehicleType.equalsIgnoreCase("bus")) {
			this.tollFee = 0.25 * this.Number_of_axles * this.Distance;
		}
		return this.tollFee;
    }
    void generateBill() {
		System.out.println("Vehicle Type : " + this.vehicleType);
		System.out.println("Number of Axles : " + this.Number_of_axles);
		System.out.println("Distance Travelled : " + this.Distance);
		System.out.println("Toll Fee : " + this.tollFee);
		this.totalAmountDue = this.tollFee + 2;
		System.out.println("Total amount due : " + this.totalAmountDue + " (Toll Fee + $2 Processing Fees)");
	}

}
class Program3_7{
    static Scanner sc = new Scanner(System.in);

		static int showMenu() {
			System.out.println("1. Enter Vehicle details");
			System.out.println("2. Calculate toll fee");
			System.out.println("3. Generate bill");
			System.out.println("0. Exit");
			System.out.print("Enter Choice: ");
			// char choice = sc.next().charAt(0);
			return sc.nextInt();
		}
    public static void main(String [] args){
      		int choice = ' ';
			Toll_Booth tb = new Toll_Booth();
			while((choice = showMenu()) != 0) {
				switch(choice) {
					case 1:
							System.out.print("Enter Vehicle Type (car, van, bus, truck) : ");
							tb.setVehicle_type(sc.nextLine());
							System.out.print("Enter number of axles : ");
							tb.setNumber_of_axles(sc.nextInt());
							System.out.print("Enter distance travelled : ");
							tb.setDistance(sc.nextDouble());
							break;
									
					case 2:
							System.out.println("Toll Fee: " + tb.calculateTollFee());
							break;

					case 3:
							System.out.println("Generate Bill: ");
							tb.generateBill();
							break;
				}
			}
    }
}