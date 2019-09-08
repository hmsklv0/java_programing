package charpter_2;

public class calculate_circle {
  public static void main(String[] args){
      double radius;
      double area;

      //step 1: Read in radius
      radius = 20.0;

      //step 2: Compute area
      area = radius * radius * 3.14159;

      //step 3: Display the area
      System.out.println("The area for the circle of radius " + radius + " is " + area);
  }
}
