import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class UtepTube {
  public static void main(String[] args) throws FileNotFoundException{
      Scanner scanner = new Scanner(System.in); 
      String filePath = ("/Users/yarah/onedrive/desktop/cs1/Comprehensive/corpus.csv");
      File corpus = new File(filePath);
      Scanner corpusScanner = new Scanner(corpus);
      String playlistLine="";
      String videoTitle1="";
      String creator1="";
      String hour1="0";
      String minutes1="";
      String seconds1="";
      String preRoll1="";
      String midRoll1="";
      String postRoll1="";
      int num=0;
      int totalHour=0;
      int totalMinute=0;
      int totalSecond=0;
      int seconds2=0;
      int finalMinutes=0;
      int finalHours=0;
      int finalSeconds=0;
      int preRoll2=0;
      int postRoll2=0;
      int midRoll3=0;
      int midRoll4=0;


      while(num != 5){
        //while loop that encloses all of the rest of my code in order to close UtepTube when the loop is exited.
        System.out.println("Welcome to UtepTube! Please select an option below to continue:");
        System.out.println("\t1. List videos in corpus");
        System.out.println("\t2. Add video to playlist");
        System.out.println("\t3. View playlist");
        System.out.println("\t4. Clear playlist");
        System.out.println("\t5. Close UtepTube");
        num = scanner.nextInt();
        if (num == 1){
          //I assigned each lineReader a variable in order for my variables to be somewhat constant throughout my code for organization.
          while(corpusScanner.hasNextLine()){
            String line = corpusScanner.nextLine();
            Scanner lineReader = new Scanner(line);
            lineReader.useDelimiter(",");
            String videoId = lineReader.next();
            System.out.print(videoId + " ");
            String videoTitle = lineReader.next();
            System.out.print(videoTitle + " ");
            String creator = lineReader.next();
            System.out.print(creator + " ");
            String minutes = lineReader.next();
            System.out.print(minutes + " ");
            String seconds = lineReader.next();
            System.out.print(seconds + " ");
            String preRoll = lineReader.next();
            String midRoll = lineReader.next();
            String postRoll = lineReader.next();
            System.out.println();
          }
          corpusScanner = new Scanner(corpus);
        }

        if (num == 2){
          System.out.println("Enter desired video ID:"); 
          corpusScanner = new Scanner(corpus); 
          String userId = scanner.next();
          boolean found = false;
          //found is used as a boolean in my while loop in a couple lines in order to force the loop to continue looping 
          //until the value of the videoId1(new variable name because I did not want to mess with the fileReader under 1), 
          //which is the first lineReader I have, equals the value of the user inputted ID(userId)
          String videoId1 = ""; 
          String line=corpusScanner.nextLine();
          Scanner lineReader=new Scanner(line);
          while (corpusScanner.hasNextLine() && (found == false)){
            //first condition ensures that the loop will stop when the file does,
            //and then my code will accurately be able to print out "invalid" if a userId cannot be found in corpus.
            line = corpusScanner.nextLine();
            lineReader = new Scanner(line);
            lineReader.useDelimiter(","); 
            videoId1 = lineReader.next(); 
            if (userId.equals(videoId1)) {
              found = true;
          }
          }
          corpusScanner = new Scanner(corpus);
          if (found){
            //declared new variables in order to stay organized and not accidentially change the values of past variables.
            videoTitle1 = lineReader.next();
            creator1 = lineReader.next();
            minutes1 = lineReader.next();
            seconds1 = lineReader.next();
            preRoll1 = lineReader.next();
            midRoll1 = lineReader.next();
            postRoll1 = lineReader.next();
            System.out.println("Added to playlist!");
            System.out.println(videoTitle1);
            System.out.println(creator1); 
          } 
          else{
            System.out.println("No matches, please try again.");
          }

          if (preRoll1.equals("true")){
            preRoll1 = "+30s preroll";
            //preoll2 is what will be added to video time.
            preRoll2 = 30;
          }
          else if (preRoll1.equals("false")){
            preRoll1 = "";
            preRoll2 = 0;
          }

          if (midRoll1.equals("true")){
            System.out.println("This video has a midroll ad, would you like to skip? yes or no");
            String midRoll2 = scanner.next();
              if(midRoll2.equals("no")){
                midRoll1 = "+2m midroll";
                //midroll3 is what will be added to the video time (in seconds).
                midRoll3 = 120;
              } 
              else if(midRoll2.equals("yes")){
                midRoll1 = "+10s midroll";
                midRoll3 = 10;
              } 
          } 
          else if(midRoll1.equals("false")){
            midRoll1=" ";
            midRoll4=0;
            midRoll3=0;
          }

          if (postRoll1.equals("true")){
            postRoll1="+ 5s postroll";
            //postroll2 is what will be added to the video time.
            postRoll2=5;
          }
          else if(postRoll1.equals("false")){
            postRoll1="";
            postRoll2=0;
          }
          //new if statement if(found)
           playlistLine += "https://youtu.be/" + videoId1 + " | " + minutes1 + ":" + seconds1 + " | " +  preRoll1 + " " + midRoll1 + " " + postRoll1+"\n";
           totalMinute += Integer.parseInt(minutes1);
           //converts a String to an int, which was needed in order to compute the % and / of the original strings (in line 150-153).
           totalSecond += Integer.parseInt(seconds1);
           totalSecond += preRoll2 + postRoll2 + midRoll3;
           totalHour += Integer.parseInt(hour1);
           finalMinutes= (totalMinute%60) +(totalSecond/60);
           finalHours= totalMinute/60;
           finalSeconds= totalSecond%60;
        }

        if(num == 3){
            System.out.println("-------------YOUR PLAYLIST-------------");
            if(playlistLine != ""){
              //done because if there is nothing in the playlist, nothing should print.
            System.out.println(playlistLine);
            }

          String hoursPrint=Integer.toString(finalHours);
          String minutesPrint=Integer.toString(finalMinutes);
          String secondsPrint=Integer.toString(finalSeconds);
        //converted ints to strings in order to add the zero in front of the value of minutes, seconds, or hours depending which one(s) are >10.
          if (finalHours<10)

            hoursPrint= ("0" + hoursPrint);
          
          if (finalMinutes<10)
            minutesPrint= ("0" + minutesPrint);

          if (finalSeconds<10)
            secondsPrint= ("0" + secondsPrint);

          System.out.println("Total play time: " + hoursPrint + ":" + minutesPrint + ":" + secondsPrint);
      }

        if(num == 4){
          playlistLine="";
          finalHours=0;
          finalMinutes=0;
          finalSeconds=0;
          preRoll2=0;
          postRoll2=0;
          totalSecond=0;
          totalMinute=0;
          totalHour=0;
          //ensures that every single value within the playlist is reset at 0.
          System.out.println("Playlist cleared!");
        }
        System.out.println();
      }
      if(num == 5){
        //since this statement exists outside the main loop, UtepTube will be exited.
        System.out.println("Thank you for choosing UtepTube.");
    }
  }
  }

