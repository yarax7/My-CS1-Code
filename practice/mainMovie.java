public class mainMovie{
  public static void main(String[] args){

    Movie myMovie= new Movie();
    myMovie.setTitle("Attack On Titan");
    myMovie.setRunTime(1.5);
    myMovie.setYear(2023);
    myMovie.setGenre("Horror/Action Fiction");

    myMovie.printInfo();
  }
}