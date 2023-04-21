public class Exhibition extends Event {
	private Integer noOfStalls;
	private Double rentPerStall;
	
	public Integer getNoOfStalls() {
		return noOfStalls;
	}
	public void setNoOfStalls(Integer noOfStalls) {
		this.noOfStalls = noOfStalls;
	}
	public Double getRentPerStall() {
		return rentPerStall;
	}
	public void setRentPerStall(Double rentPerStall) {
		this.rentPerStall = rentPerStall;
	}
	Exhibition(){
		
	}
	public Exhibition(String name, String detail, String type, String organiser, Integer noOfStalls,Double rentPerStall)
	{
		this.name=name;
		
		this.detail=detail;
		this.type=type;
		this.organiser=organiser;
		this.noOfStalls=noOfStalls;
		this.rentPerStall=rentPerStall;
	}

    Double calculateAmount() 
    {
     Double product=noOfStalls*rentPerStall;
        return product;
    }
     	
}