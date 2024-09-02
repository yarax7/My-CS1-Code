public class Movie{
  //Attributes
  private String title;
  private double runTime;
  private int releaseYear;
  private String genre;

  //Constructor
  public Movie(){

  }

  public Movie(String titleIn){
    this.title = titleIn;
  }

  public Movie(double runTimeIn){
    this.runTime = runTimeIn;
  }

  public Movie(int yearIn){
    this.year= yearIn;
  }

  public Movie(String genreIn){
    this.genre=genreIn;
  }



  //Methods
    //Setters
  public void setTitle(String titleIn){
    this.title = titleIn;
  }

  public void setRunTime(double runTimeIn){
    this.runTime = runTimeIn;
  }

  public void setYear(int yearIn){
    this.year = yearIn;
  }

  public void setGenre(String genreIn){
    this.genre=genreIn;
  }

    //Getters
  public String getTitle(){
    return this.title;
  }

  public double getRunTime(){
    return this.runTime;
  }

  public int getYear(){
    return this.year; 
  }

  public String getGenre(){
    return this.genre;
  }

  public static void printInfo(){
    System.out.println("Title: "+getTitle());
    System.out.println("Run time: "+getRunTime());
    System.out.println("Year: "+getYear());
  }

}
