/*******************
Name: Matas Backevicius

Date: Apr 28, 2021

Notes:   Here the goal was to create a class named Car
and list all the variables under it in the class we had the method,
and the method is connected to the new object
we created in the main string args.
By doing so the goal is to display assigned values, 
and we do that by returning the method in relation to the new object we created.
*******************/


class Car {             /* define the class named 'car'    */
   String type;
   int motion;
   String model;
   String condition;  /* list all the types of variables if it's int and/or String */
   int year;
   int price;
   String dscrpt;
   

public String accelerate() {
   return (motion + "mph  is the speed/motion of the newest model of >>> Toyota.");
   
  }     /* once the variables are listed, create a method
              and create a return statement for whihc it will return its assigned value. */
  
  public String accelerate0() {
   return ("It's model is >>> " + model + ".");
   
  }     /* and another method with a different value*/
  
  public String accelerate1() {
   return ("The Condition is excelent which is >>> " + condition + ".");
   
  }       /* another method */
        
  public String accelerate2() {
   return ("This newest model of Toyota was introduced to us this year in " + year + ".");
   
  }         /* another method */
  
  public String accelerate3() {
   return ("The price ranges from  >>> " + price + " and above.");
   
  }
  
  public String accelerate4() {
   return ("Toyota " + model + 
   " is a very reliable car. Not only for a regular use, " +
    "but more likely for sports."+"\n"+" It's a car that is " + "/n" + " >>> " + dscrpt + ".");
   
  }      /* and last two method */
  
          
 
  public static void main(String[] args) {
      Car toyota= new Car();        /* create an object for the class ' Car' */                                
      toyota.motion= 155;
      toyota.model= "Supra";   /*reference the object's name and the variable name*/
      toyota.condition= "undamaged/brand new";
      toyota.year= 2021;
      toyota.price= 43000;   /* list all the variables and their assigned values */
      toyota.dscrpt= "more affordable in price, and reliable in performance";
      System.out.println(toyota.accelerate());
      System.out.println();
      System.out.println(toyota.accelerate0());
      System.out.println();                     /* print each method
                             with its variable(s) returning its assigned value */
      System.out.println(toyota.accelerate1());
      System.out.println();
      System.out.println(toyota.accelerate2());
      System.out.println();
      System.out.println(toyota.accelerate3());
      System.out.println();
      System.out.println(toyota.accelerate4());
      
      
      /* print the method with a returning statement listing all the values asigned
       to the variables in the new object under the class 'Car'. */
      /* all variables connected to the new object named 'toyota' in the class named 'Car' */

   }
  }
         
