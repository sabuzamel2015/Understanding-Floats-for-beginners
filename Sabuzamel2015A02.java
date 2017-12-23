
/* Sabuzamel2015A02.java
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabuzamel2015a02.java;

import java.util.Scanner;

/**
 *
 * @author sabuzamel2015
 */
public class Sabuzamel2015A02 {

   /**
    * Calculating the perimeter of a rectangle and square
    * Calculating the area of a square, rectangle and circle
    * Calculating the circumference of a circle
    */
      public static void main(String[] args) {
      
   
   Scanner input = new Scanner( System.in );// this scanner accepts user input
    


    // Calculating the perimeter of the rectangle
    System.out.print("Enter the height of rectangle: ");
    float height = input.nextFloat();
    System.out.print("Enter the width of the rectangle: ");
    float width = input.nextFloat();
    float rectanglePerimeter = 2 * height + 2 * width ;
    System.out.printf("Perimeter of a rectangle is: %f%n%n",
       rectanglePerimeter );
    
    // Calculating the perimeter of a square
    System.out.print("Enter the side of a square: ");
    float side = input.nextFloat();
    float squarePerimeter = 4 * side ;
    System.out.printf("Perimeter of a square is: %f%n%n",squarePerimeter );
    
    
    //Calculating the area of a circle
    System.out.print("Enter the radius of a cirlce: ");
    float radius = input.nextFloat() ;
    float circleArea = (float) (Math.PI * radius * radius);
    System.out.printf("Area of a circle is: (%f)^2 * 3.14 = %f%n%n",
      radius, circleArea) ;
    
    // Calculating the circumference of a circle
    System.out.print("Enter the diameter of a circle: ") ;
    float diameter = input.nextFloat() ;
    float circleCircumference = (float) (Math.PI * diameter) ;
    System.out.printf("Circumference of a circle is: (%f) * 3.14 = %f%n%n", 
      diameter, circleCircumference);
    
   //Calculating the area of a rectangle
    System.out.print("Enter the height of a rectangle: ") ;
    float height1 = input.nextFloat();
    System.out.print("Enter the width of the rectangle: ");
    float width1 = input.nextFloat();
    float rectangleArea = (height1 * width1) ;
    System.out.printf("Area of a rectangle is: %f * %f = %f%n%n", 
     height1, width1 , rectangleArea);
    
       
   
   //Calculating the area of a square
   System.out.print("Enter the height of a square: ") ;
   float height2 = input.nextFloat() ;
   System.out.print("Enter the width of a square: ") ;
   float width2 = input.nextFloat() ;
   float squareArea = (float) (height2 * width2) ;
   System.out.printf("Area of a square is: %f * %f = %f%n%n", 
    height2, width2, squareArea) ; 
    
    
        
   
   
   
   
   
   }
   
}  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

