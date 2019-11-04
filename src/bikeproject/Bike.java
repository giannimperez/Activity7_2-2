package bikeproject;

public abstract class Bike {

	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	private final String make;
	
	public Bike(){	
		this.make = "Oracle Cycles";
	}//end constructor
	
	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
		this.make = "Oracle Cycles";
	}//end constructor

	@Override
	public String toString()
	{

		return("\n" + this.make + "\n"
				+ "This bike has " + this.handleBars + " handlebars on a "
				+ this.frame + " frame with " + this.NumGears + " gears."
				+ "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription




	/*protected void printDescription()
	{
		System.out.println("\n" + this.make + "\n" 
				          + "This bike has " + this.handleBars.toString() + " handlebars on a "
				          + this.frame.toString() + " frame with " + this.NumGears + " gears."
				          + "\nIt has a " + this.seatType.toString() + " seat with " + this.tyres.toString() + " tyres.");
	}//end method printDescription
*/




    public String getHandleBars(){
        return getHandleBars();
    }
    public void setHandleBars(String newValue){

    }
    public String getTyres(){
	    return getTyres();
    }
    public void setTyres(String newValue){

    }
    public String getSeatType(){
	    return getSeatType();
    }
    public void setSeatType(String newValue){

    }


}//end class Bike

	

