
public class PlaneSeat {
	
	int SeatId;
	boolean assigned=false;
	int customerId=0;
	
	public PlaneSeat(int seat_id){
		this.SeatId=seat_id;
	}
	
	public int getSeatID(){
		return SeatId;
	}
	
	public int getCustomerID(){
		return customerId;
	}
	
	public boolean isOccupied(){
		return assigned;
	}
	
	public void assign(int cust_id){
		customerId=cust_id;
		assigned=true;
	}
	
	public void unAssign(){
		customerId=-1;
		assigned=false;
	}
}
