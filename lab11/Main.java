import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    //First car object
    Car myCar1 = new Car();
    myCar1.setMake("Volvo");
    myCar1.setModel("s60");
    myCar1.setYear(2020);
    myCar1.setColor("Denim Blue");
    myCar1.setIsElectric(false);
    myCar1.setCost(45000);

    myCar1.displayInfo();

    System.out.println();

    myCar1.setYear(2023);
    myCar1.setColor("Red");

    myCar1.displayInfo();

    System.out.println();

    //Second car object
    Car myCar2 = new Car("Toyota","Camry",2003);
    myCar2.setColor("Silver");
    myCar2.setIsElectric(false);
    myCar2.setCost(20285);

    myCar2.displayInfo();

    System.out.println("What is the make of your car?");
    Scanner scanner = new Scanner(System.in); 
    String userMake = scanner.next();
    System.out.println("What is the model of your car?");
    String userModel = scanner.next();
    System.out.println("What is the year of your car?");
    int userYear = scanner.nextInt();
    System.out.println("What is the color of your car?");
    String userColor = scanner.next();
    System.out.println("Is your car electric? True or False.");
    boolean userIsElectric = scanner.nextBoolean();
    System.out.println("How much is your car?");
    int userCost = scanner.nextInt();

    Car myCar3 = new Car();
    myCar3.setMake(userMake);
    myCar3.setModel(userModel);
    myCar3.setYear(userYear);
    myCar3.setColor(userColor);
    myCar3.setIsElectric(userIsElectric);
    myCar3.setCost(userCost);

    myCar3.displayInfo();
  }
}