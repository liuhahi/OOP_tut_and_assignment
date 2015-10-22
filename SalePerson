
public class SalePerson {

	private String firstName;
	private String lastName;
	private int totalSales;
	
	public SalePerson(String firstName,String lastName,int totalSales){
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
		
	}
	
	public String toString(){
		return firstName+" "+lastName;
	}
	public boolean equals(Object o){
		return this.equals(o);
	}
	public int compareTo(Object o){
		if(o instanceof SalePerson)
		{
			SalePerson sp = (SalePerson)o;
			return sp.totalSales-this.totalSales;
		}
		else
			return -1;
	}
}
