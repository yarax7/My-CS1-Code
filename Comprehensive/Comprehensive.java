import java.util.Scanner;
class Comprehensive {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in); 
  //int scanner;
  System.out.println("Welcome to UtepTube! Please select an option below to continue:");
  System.out.println("\t1. List videos in corpus");
  System.out.println("\t2. Add video to playlist");
  System.out.println("\t3. View playlist");
  System.out.println("\t4. Clear playlist");
  System.out.println("\t5. Close UtepTube");
  int num = scanner.nextInt();
if (num == 1){
  System.out.println("|                                        UtepTube corpus                                        |");
  System.out.println("| VIDEO ID    | VIDEO TITLE                                       |             CREATOR | MM:SS |");
  System.out.println("| 5Fg9oZk-5uA | I Bought Everything In 5 Stores                   |             MrBeast | 14:14 |");
  System.out.println("| oNCs4C2SMjo | Apple Watch Series 9 & Ultra 2: What Are We Wa... |    Marques Brownlee | 10:29 |");
  System.out.println("| XKu_SEDAykw | How to: Work at Google — Example Coding/Engine... |      Life at Google | 24:02 |");
  System.out.println("| ZAfAud_M_mg | Halsey - Without Me                               |              Halsey | 03:57 |");
  System.out.println("| GnJAqV3VMUE | LA MORNING ROUTINE LOL                            |    emma chamberlain | 25:09 |");
}
}
}