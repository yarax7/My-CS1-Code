public class Song{

  //Attributes
  private String title;
  private String artist;
  private int duration;
  private int rating;

  // Constructor
  public Song(){

  }

  public Song(String titleIn, String artistIn){
    this.title = titleIn;
    this.artist = artistIn;
  }

  public Song(String titleIn, String artistIn, int durationIn, int ratingIn){
    this.title = titleIn;
    this.artist = artistIn;
    this.duration = durationIn;
    this.rating = ratingIn;
  }


  // setters
  public void setTitle(String titleIn){
    this.title = titleIn;
  }

  public void setArtist(String artistIn){
    this.artist = artistIn;
  }

  public void setDuration(int durationIn){
    this.duration = durationIn;
  }

  public void setRating(int ratingIn){
    this.rating = ratingIn;
  }


  // getters
  public String getTitle(){
    return this.title; 
  }

  public String getArtist(){
    return this.artist; 
  }

  public int getDuration(){
    return this.duration; 
  }

  public int getRating(){
    return this.rating; 
  }

  // methods
  public void printInfo(){
    System.out.println("Title: " + this.title);
    System.out.println("Artist: " + this.artist);
    System.out.println("Duration: " + this.duration);
    System.out.println("Rating: " + this.rating);
  }
}

