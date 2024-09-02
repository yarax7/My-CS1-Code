public class Movie{
  //Attributes
  private String title;
  private double runTime;
  private int year;
  private String genre;

  //Constructor
  public Movie(){

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

  public void printInfo(){
    System.out.println("Title: "+getTitle());
    System.out.println("Run time: "+getRunTime() +" hours");
    System.out.println("Year: "+getYear());
    System.out.println("Genre: "+getGenre());
  }

}
