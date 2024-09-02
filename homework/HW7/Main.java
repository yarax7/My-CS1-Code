import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
public class Main{
  public static void main(String[] args) throws FileNotFoundException{
    Scanner scanner=new Scanner(System.in);
  


    Song song1 = new Song("Flawless","Yeat ft. Lil Uzi Vert");
    Song song2 = new Song("Hey Jude", "The Beetles");
    Song song3 = new Song("Golden Hour","JVKE");
    Song song4 = new Song("Perfect Night","Le Sserafim");
    Song[] playlist = {song1, song2, song3, song4};

    for (int i = 0; i < playlist.length; i++) {
      System.out.println("What is the duration of "+playlist[i].getTitle()+" by "+playlist[i].getArtist()+"? (in seconds)");
      int dur=scanner.nextInt();
      playlist[i].setDuration(dur);
      System.out.println("Rate "+playlist[i].getTitle()+" by "+playlist[i].getArtist()+" on the scale of 1-10.");
      int rating=scanner.nextInt();
      playlist[i].setRating(rating);
    }

    System.out.println("-----------------------------------");

    for(int i=0;i<playlist.length;i++){
      playlist[i].printInfo();
    }

    System.out.println("-----------------------------------");

    for(int i=0;i<100;i++){
      Random random= new Random();
      int random1= random.nextInt(playlist.length);
      int random2= random.nextInt(playlist.length);

      shuffle(playlist, random1, random2);
    }

    for(int i=0;i<playlist.length;i++){
      playlist[i].printInfo();
    }

    System.out.println("-----------------------------------");

    String line[]=new String[4];
    Song newPlaylist [] = new Song[20];
    File file= new File("songs.csv");
    Scanner fileScanner=new Scanner(file);
    int x=0;
    while(fileScanner.hasNextLine()){
      String currentLine= fileScanner.nextLine();
      line=currentLine.split(",");
      Song newSong= new Song(line[0], line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]));
      newPlaylist[x]= newSong;
      newPlaylist[x].printInfo();
      x++;
    }

    for(int i=0;i<100;i++){
      Random random= new Random();
      int random1= random.nextInt(playlist.length);
      int random2= random.nextInt(playlist.length);

      shuffle(newPlaylist, random1, random2);
    }

    System.out.println("-----------------------------------");

    for(int i=0;i<newPlaylist.length;i++){
      newPlaylist[i].printInfo();
    }
  }


  public static void shuffle(Song[] playlist, int randomValue, int randomValue1){
    Song firstSwap=playlist[randomValue];
    Song secondSwap=playlist[randomValue1];
    playlist[randomValue]=secondSwap;
    playlist[randomValue1]=firstSwap;
  }
}














    // System.out.print("What is the duration of "+song1.getTitle()+" by "+song1.getArtist()+"?");
    // int duration1 = scanner.nextInt();
    // System.out.println();
    // System.out.print("What would you rate "+song1.getTitle()+" by "+song1.getArtist()+"?");
    // int rating1 = scanner.nextInt();


    // System.out.print("What is the duration of "+song2.getTitle()+" by "+song2.getArtist()+"?");
    // int duration2 = scanner.nextInt();
    // System.out.println();
    // System.out.print("What would you rate "+song2.getTitle()+" by "+song2.getArtist()+"?");
    // int rating2 = scanner.nextInt();


    // System.out.print("What is the duration of "+song3.getTitle()+" by "+song3.getArtist()+"?");
    // int duration3 = scanner.nextInt();
    // System.out.println();
    // System.out.print("What would you rate "+song3.getTitle()+" by "+song3.getArtist()+"?");
    // int rating3 = scanner.nextInt();


    // System.out.print("What is the duration of "+song4.getTitle()+" by "+song4.getArtist()+"?");
    // int duration4 = scanner.nextInt();
    // System.out.println();
    // System.out.print("What would you rate "+song4.getTitle()+" by "+song4.getArtist()+"?");
    // int rating4 = scanner.nextInt();

  














  




// for (int i = 0; i < playlist.length; i++) {
//       System.out.println("What is the duration of" + playlist[i].getTitle() + " by" + playlist[i].getArtist());
//     } 






