package bikeproject;

public class RoadBike extends Bike{
	
	private int  tyreWidth, postHeight;
	
	public RoadBike()
	{
		this("drop", "racing", "tread less", "razor", 19, 20, 22);
	}//end constructor
	
	public RoadBike(int postHeight)
	{
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}//end constructor
		
	public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
			int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
	}//end constructor
	
	public String toString()
	{

		return(super.toString() + "This Roadbike bike has " + this.tyreWidth + "mm tyres and a post height of " + this.postHeight + ".");
	}//end method printDescription


	public String getTyreWidth(){
		return getTyreWidth();
	}
	public void setTyreWidth(String newValue){

	}
	public int getPostHeight(){
		return getPostHeight();
	}
	public void setPostHeight(int newValue){
		this.postHeight = newValue;
	}

}//end class RoadBike
