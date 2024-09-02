import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Filters {
  public static void main(String[] args)throws IOException {
    // TODO: modify this main method as you wish, to run and test your filter implementations.

    //Read in the image file.
    // File f = new File("mika.jpg");
    String fileName = "mika.jpg";
    File f = new File(fileName);
    BufferedImage img = ImageIO.read(f);

    // For debugging
    System.out.println("Before:");
    System.out.println(Utilities.getRGBArray(1, 1, img)[0]);
    System.out.println(Utilities.getRGBArray(0, 0, img)[1]);
    System.out.println(Utilities.getRGBArray(0, 0, img)[2]);
    // 92 40 27

    //CALLING EACH METHOD:

       // applyGrayscale(img);

      // applyNorak(img);

      //GREEN BORDER:
      // int thick=100;
      // int [] color= {66,94,77};

      //RED BORDER:
      //int thick=10;
      //int [] color={235,64,52};

      //WHITE BORDER:
      // int thick=30;
      // int [] colorWhiteBorder={255,255,255};

      // applyBorder(img,thick,color);  

      // applyMirror(img);

      applyCustom(img);

      // applyBlur(img);

    // For debugging
    System.out.println("After:");
    System.out.println(Utilities.getRGBArray(1, 1, img)[0]);
    System.out.println(Utilities.getRGBArray(0, 0, img)[1]);
    System.out.println(Utilities.getRGBArray(0, 0, img)[2]);
    // 53 53 53

    // Write the result to a new image file.
    f = new File("mika_filtered.png");
    ImageIO.write(img, "jpg", f); 
    
  }

  public static void applyGrayscale(BufferedImage img) {
    int sum=0;
    int average=0;
    int red=0;
    int green=0;
    int blue=0;
    int [] grayRGB= new int[3];
    //Traversing through the array normally, and then averaging the RGB values on each and every pixel.
    for(int i=0;i<img.getHeight();i++){
      for(int j=0;j<img.getWidth();j++){
        red=Utilities.getRGBArray(i,j,img)[0];
        green=Utilities.getRGBArray(i,j,img)[1];
        blue=Utilities.getRGBArray(i,j,img)[2];
        sum = red+blue+green;
        average=sum/3;
        grayRGB[0]=average;
        grayRGB[1]=average;
        grayRGB[2]=average;
        //Setting each pixel to the new average value.
        Utilities.setRGB(grayRGB,i,j,img);
      }
    }
  }
    public static void applyNorak(BufferedImage img) {
    int sum=0;
    int average=0;
    int red=0;
    int green=0;
    int blue=0;
    int [] norakApplied= new int[3];
    //Similarly to the grayscale, we traverse the image normally and average the RGB values on each pixel that has an average value higher than 153.
      for(int i=0;i<img.getHeight();i++){
        for(int j=0;j<img.getWidth();j++){
          red=Utilities.getRGBArray(i,j,img)[0];
          green=Utilities.getRGBArray(i,j,img)[1];
          blue=Utilities.getRGBArray(i,j,img)[2];
          sum = red+blue+green;
          average=sum/3;
          if(average>153){
            norakApplied[0]=average;
            norakApplied[1]=average;
            norakApplied[2]=average;
            //Setting each pixel to the new average value.
            Utilities.setRGB(norakApplied,i,j,img);
          }
        }
      }
  }

  public static void applyBorder(BufferedImage img, int borderThickness, int[] borderColor) {
    int [] borderApplied = new int[3];
    //Nested for loops that traverse through the image normally, but change the color of the pixels when the conditions for a border are met.
    for(int i=0;i<img.getHeight();i++){
      for(int j=0; j<img.getWidth();j++){
        if(i<borderThickness){
          //Creates the right vertical line.
          borderApplied[0]= borderColor[0];
          borderApplied[1]= borderColor[1];
          borderApplied[2]= borderColor[2];
          Utilities.setRGB(borderApplied,i,j,img);
        }
        if(j<borderThickness){
          //Creates the top horizontal line.
          borderApplied[0]= borderColor[0];
          borderApplied[1]= borderColor[1];
          borderApplied[2]= borderColor[2];
          Utilities.setRGB(borderApplied,i,j,img);
        }
        if(i>=img.getHeight()-borderThickness){
          //Creates the left vertical line.
          borderApplied[0]= borderColor[0];
          borderApplied[1]= borderColor[1];
          borderApplied[2]= borderColor[2];
          Utilities.setRGB(borderApplied,i,j,img);
        }
        if(j>=img.getWidth()-borderThickness){
            //Creates the bottom horizontal line.
          borderApplied[0]= borderColor[0];
          borderApplied[1]= borderColor[1];
          borderApplied[2]= borderColor[2];
          Utilities.setRGB(borderApplied,i,j,img);
        }
      }
    }
  }

public static void applyMirror(BufferedImage img){
  int h=img.getHeight();
  int w=img.getWidth();
  for(int i=0;i<h;i++){
    //Traverses through the image normally, but I created a new variable (reverseJ) to use as a coordinate to swap every two pixels on opposite sides of the image.
    int reverseJ=w-1;
    for(int j=0;j<w/2;j++){
      int [] original =Utilities.getRGBArray(i,j,img);
      int [] reverse=Utilities.getRGBArray(i,reverseJ,img);
      Utilities.setRGB(original,i,reverseJ,img);
      //These two lines swap the pixels.
      Utilities.setRGB(reverse,i,j,img);
      reverseJ--;
    }
  }
}

  public static void applyBlur(BufferedImage img) {
    int [][][] temp= new int [img.getHeight()][img.getWidth()][3];
    //Created a new 3D Array in order to take the averages of the original values and not take the average of the average.
    int [] topLeft=new int[3];
    int [] topMid=new int[3];
    int [] topRight=new int[3];
    int [] left=new int[3];
    int [] mid=new int[3];
    int [] right=new int[3];
    int [] bottomLeft=new int[3];
    int [] bottomMid=new int[3];
    int [] bottomRight=new int[3];
    int averageRed=0;
    int averageGreen=0;
    int averageBlue=0;
    int [] rgb= new int[3];
    for(int i=1;i<img.getHeight()-1;i++){
      for(int j=1;j<img.getWidth()-1;j++){
        //Traversing through the image normally, while changing the values of i and j for each array in order to get the values of all the 8 pixels surrounding the main pixel.
        topLeft=Utilities.getRGBArray(i-1,j-1,img);
        topMid=Utilities.getRGBArray(i-1,j,img);
        topRight=Utilities.getRGBArray(i-1,j+1,img);
        left=Utilities.getRGBArray(i,j-1,img);
        mid=Utilities.getRGBArray(i,j,img);
        right=Utilities.getRGBArray(i,j+1,img);
        bottomLeft=Utilities.getRGBArray(i+1,j-1,img);
        bottomMid=Utilities.getRGBArray(i+1,j,img);
        bottomRight=Utilities.getRGBArray(i+1,j+1,img);
        //Takes the average of all the red, green, and blue values seperately. 
        averageRed=(topLeft[0]+topMid[0]+topRight[0]+left[0]+mid[0]+right[0]+bottomLeft[0]+bottomMid[0]+bottomRight[0])/9;
        averageGreen=(topLeft[1]+topMid[1]+topRight[1]+left[1]+mid[1]+right[1]+bottomLeft[1]+bottomMid[1]+bottomRight[1])/9;
        averageBlue=(topLeft[2]+topMid[2]+topRight[2]+left[2]+mid[2]+right[2]+bottomLeft[2]+bottomMid[2]+bottomRight[2])/9;
        //Setting each color value, its new averaged value.
        temp[i][j][0]=averageRed;
        temp[i][j][2]=averageBlue; 
        temp[i][j][1]=averageGreen; 
      }
    }
    //Sets the rgb values to the new averaged values.
    for(int i=1;i<temp.length-1;i++){
      for(int j=1;j<temp[i].length-1;j++){
        rgb=temp[i][j];
        Utilities.setRGB(temp[i][j],i,j,img);
      }
    }
  }

  public static void applyCustom(BufferedImage img) {
    //To obtain a pink filter over my image, I added some red to each pixel in the image.
    int sum=0;
    int average=0;
    int red=0;
    int green=0;
    int blue=0;
    int [] grayRGB= new int[3];
    for(int i=0;i<img.getHeight();i++){
      for(int j=0;j<img.getWidth();j++){
        red=Utilities.getRGBArray(i,j,img)[0];
        green=Utilities.getRGBArray(i,j,img)[1];
        blue=Utilities.getRGBArray(i,j,img)[2];
        sum = red+blue+green;
        average=sum/3;
        grayRGB[0]=red+20;
        grayRGB[1]=average;
        grayRGB[2]=average;
        Utilities.setRGB(grayRGB,i,j,img);
      }
    }
  }
}