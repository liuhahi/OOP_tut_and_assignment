import java.util.Scanner;


public class PlaneApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] days = new int[12]; // one line code
//		int i;
//		int[ ] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } ;
//		for(i=0;i<days.length;i++)
//			System.out.println("Month "+ (i+1)+ " has "+days[i]+" days.");
//		
//	
		int choice;
		Scanner sc = new Scanner(System.in);
		Plane plane = new Plane();
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: Show the number of empty seats ");
			System.out.println("2: Show the list of empty seats");
			System.out.println("3: Show the list of customers together with their seat numbers in the order of the seat numbers");
			System.out.println("4: Show the list of customers together with their seat numbers in the order of the customer ID");
			System.out.println("5: Assign a customer to a seat");
			System.out.println("6: Remove a seat assignment");
			System.out.println("7: Quit");
			choice = sc.nextInt();
			switch (choice) {
			 case 1: /* Show the number of empty seats */
				 plane.showNumEmptySeats();
			 break;
			 case 2: /* Show the list of empty seats */
				 plane.showEmptySeats();
			 break;
			 case 3: /* Show the list of customers together with their seat numbers in the order of the seat numbers */
				 plane.showAssignedSeat(true);
			 break;
			 case 4: /* Show the list of customers together with their seat numbers in the order of the customerID */
				 plane.showAssignedSeat(false);
			 break;
			 case 5: /* add position() call */
				 System.out.println("Input your seat ID:");
				 int seatID = sc.nextInt();
				 System.out.println("Input your Customer ID:");
				 int cid = sc.nextInt();
				 plane.assignSeat(seatID, cid);
			 break;
			 case 6: /* Remove a seat assignment */
				 System.out.println("Input your seat ID:");
				 int unAssignedseat = sc.nextInt();
				 unAssignedseat-=1;
				 plane.unAssignSeat(unAssignedseat);
			 break; 
			 	case 7: System.out.println("Program terminating ….");
			 break;
			}
			}while(choice<7);
		 
		 
		}

}
