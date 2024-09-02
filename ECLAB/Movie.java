public class Movie{
	
	//Attributes
	private String movieName;
	private String genre;
	private int numTicketsAvailable;
	private double ticketPrice;
	private double popcornPrice;
	private double sodaPrice;
	private double candyPrice;
	//Constructors
	public Movie(){

	}

	// public Movie(){
	// 	//add needed
	// }

	//Methods
	// public boolean ticketsAreAvailable(int numTicks){
		
	// }

	//Getters/Setters
	public void setMovieName(String movieNameIn){
		this.movieName=movieNameIn;
	}
	public String getMovieName(){
		return this.movieName;
	}

	public void setGenre(String genreIn){
		this.genre=genreIn;
	}
	public String getGenre(){
		return this.genre;
	}

	public void setNumTicketsAvailable(int numTicketsAvailableIn){
		this.numTicketsAvailable=numTicketsAvailableIn;
	}
	public int getNumTicketsAvailable(){
		return this.numTicketsAvailable;
	}

	public void setTicketPrice(double ticketPriceIn){
		this.ticketPrice=ticketPriceIn;
	}
	public double getTicketPrice(){
		return this.ticketPrice;
	} 

	public void setPopcornPrice(double popcornPriceIn){
		this.popcornPrice=popcornPriceIn;
	}
	public double getPopcornPrice(){
		return this.popcornPrice;
	}

	public void setSodaPrice(double sodaPriceIn){
		this.sodaPrice=sodaPriceIn;
	}
	public double getSodaPrice(){
		return this.sodaPrice;
	}

	public void setCandyPrice(double candyPriceIn){
		this.candyPrice=candyPriceIn;
	}
	public double getCandyPrice(){
		return this.candyPrice;
	}

}
