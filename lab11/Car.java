public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean isElectric;
    private int cost;

    //Default constructor:
    public Car(){

    }
    //Constructor that accepts make, model, and year.
    public Car(String makeIn, String modelIn, int yearIn){
      this.make = makeIn;
      this.model = modelIn;
      this.year = yearIn;
    }

    //Setter methods
    public void setMake(String makeIn){
      this.make=makeIn;
    }

    public void setModel(String modelIn){
      this.model=modelIn;
    }

    public void setYear(int yearIn){
      this.year=yearIn;
    }

    public void setColor(String colorIn){
      this.color=colorIn;
    }

    public void setIsElectric(boolean isElectricIn){
      this.isElectric=isElectricIn;
    }

    public void setCost(int costIn){
      this.cost=costIn;
    }

    //Getter methods:

    public String getMake(){
      return this.make;
    }

    public String getModel(){
      return this.model;
    }

    public int getYear(){
      return this.year;
    }

    public String getColor(){
      return this.color;
    }

    public boolean getIsElectric(){
      return this.isElectric;
    }

    public int getCost(){
      return this.cost;
    }

    //Display Method:

    public void displayInfo(){
      System.out.println("Make: "+getMake());
      System.out.println("Model: "+getModel());
      System.out.println("Year: "+getYear());
      System.out.println("Color: "+getColor());
      System.out.println("Electric? "+getIsElectric());
      System.out.println("Cost: "+getCost());
    }


  }