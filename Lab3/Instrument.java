public class Instrument {
	private String instrument;
	private String tuning;
	private boolean hasStrings;
	private double price;
	
	public Instrument(){
		
	} 
	
	public Instrument(String instrument, String tuning, boolean hasStrings, double price){
		setInstrument(instrument);
		setTuning(tuning);
		setHasStrings(hasStrings);
		setPrice(price);
	}
	
	public void setInstrument(String instrument){
		this.instrument = instrument;
	}
	
	public void setTuning(String tuning){
		this.tuning = tuning;
	}
	
	public void setHasStrings(boolean hasStrings){
		this.hasStrings = hasStrings;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getInstrument(){
		return this.instrument;
	}
	
	public String getTuning(){
		return this.tuning;
	}
	
	public boolean getHasStrings(){
		return this.hasStrings;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public String toString(){
		String txt;
		
		if(this.hasStrings == true){
			txt = "has";
		}else{
			txt = "hasn't";
		}
		
		return "The instrument is a " + instrument +
			   "\nIt's tuned in " + tuning +
			   "\nThe instrument " + txt + " Strings" +
			   "\nThe price is €" + price;
	}
	
}