public class StageEvent extends Event{
	private Integer noOfShows;
	private Double costPerShow;
	
    public Integer getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(Integer noOfShows) {
		this.noOfShows = noOfShows;
	}


	public Double getCostPerShow() {
		return costPerShow;
	}


	public void setCostPerShow(Double costPerShow) {
		this.costPerShow = costPerShow;
	}
	
	public StageEvent(String name, String detail, String type, String organiser, Integer noOfShows,Double costPerShow) {
	this.name=name;
		
		this.detail=detail;
		this.type=type;
		this.organiser=organiser;
		this.noOfShows=noOfShows;
		this.costPerShow=costPerShow;
	}

	  Double calculateAmount() {
		Double product=noOfShows*costPerShow;
        return product;

    }  
}