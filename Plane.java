
public class Plane {
	
	private PlaneSeat[] seats=new PlaneSeat[12];
	//seats[0]=new PlaneSeat;
	private int numEmptySeat=12;
	
	public Plane(){
		
		seats[0] = new PlaneSeat(0);
		seats[1] = new PlaneSeat(1);
		seats[2] = new PlaneSeat(2);
		seats[3] = new PlaneSeat(3);
		seats[4] = new PlaneSeat(4);
		seats[5] = new PlaneSeat(5);
		seats[6] = new PlaneSeat(6);
		seats[7] = new PlaneSeat(7);
		seats[8] = new PlaneSeat(8);
		seats[9] = new PlaneSeat(9);
		seats[10] = new PlaneSeat(10);
		seats[11] = new PlaneSeat(11);
		
	}
	
	private PlaneSeat[] sortSeats(){
		
		PlaneSeat[] sortedSeat = new PlaneSeat[12];
		sortedSeat = (PlaneSeat[])seats.clone();
		int j,i;
		PlaneSeat temp;
		//some sorting by customerID
        for( i=0;  i < sortedSeat.length-1 ;  i++ )
        {
        	for(j=0; j<sortedSeat.length-i-1;j++){
               if ( sortedSeat[j].customerId < sortedSeat[j+1].customerId )   // change to > for ascending sort
               {
                       temp = sortedSeat[j];                //swap elements
                       sortedSeat[j] = sortedSeat[j+1];
                       sortedSeat[j+1] = temp;            //shows a swap occurred  
              } 
               }
        } 
		
		return sortedSeat; 
	}
	
	public void showNumEmptySeats(){
		
		System.out.println("The plane has "+numEmptySeat+ " of empty seat");
	}
	
	public void showEmptySeats(){
			
		int i = 0;
		System.out.println("The empty seats list:");
		for(i=0;i<12;i++){
			if(seats[i].assigned==false)
				System.out.println("Seat No. "+ i +" is empty.");
		}
		
	}

	public void showAssignedSeat(boolean bySeatId){
		
		int i = 0;
		if(bySeatId==true){
			System.out.println("Sorted by seatId");
			for(i=0;i<12;i++){
					System.out.println(seats[i].SeatId+ " "+seats[i].customerId);
			}
		}else{
			PlaneSeat[] sortSeats=this.sortSeats();			
			for(i=0;i<sortSeats.length;i++){
				System.out.println(sortSeats[i].customerId+ " "+sortSeats[i].SeatId);
			}
		}
		
	}
	
	public void assignSeat(int seatId, int cust_id){
		int i;

			if(seats[seatId].assigned==false){
				seats[seatId].customerId=cust_id;
				seats[seatId].assigned=true;
				numEmptySeat--;
			}else{
				System.out.println("Seat is taken!!:(");
			}
		
	}
	
	public void unAssignSeat(int seatId){
		//int i;
		if(seats[seatId].assigned==true){
			numEmptySeat++;
			seats[seatId].assigned=false;
		}else{
			System.out.println("unassign failed!!:(");
		}
	}
}
