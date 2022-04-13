import java.util.*; 

public class Calculator 
{ 
    private int solution; 
    // private static int x; 
    // private static int y; 
    // private char operators;
    Scanner s = new Scanner(System.in);

    public Calculator() 
    { 
        solution = 0; 
    //    Scanner operators = new Scanner(System.in); 
    //    Scanner operands = new Scanner(System.in);
    } 

    public int addition(int x, int y) 
    { 
       return x + y; 
    } 
    public int subtraction(int x, int y) 
    { 
       return x - y; 
    } 
    public int multiplication(int x, int y) 
    {     
       return x * y; 
    } 
    public int division(int x, int y) 
    { 
       solution = x / y; 
       return solution; 
    } 

    public void calc(int ops){
         //x = 4; 
         System.out.println("Please Select the first number to use");
         int x = s.nextInt();
         System.out.println("Please Select the second number to use");
         int y = s.nextInt();
         // y = 5; 

         switch(ops) 
         { 
             case(1): 
               System.out.println(addition(x, y)); 

           //    operands.next(); 
               break; 
             case(2): 
                 System.out.println(subtraction(x, y)); 
              // operands.next(); 
               break; 
             case(3): 
                 System.out.println(multiplication(x, y)); 
             //  operands.next(); 
               break; 
             case(4): 
                 System.out.println(division(x, y));
             //  operands.next(); 
               break; 
          } 
    }
    public static void main (String[] args) 
    { 
      System.out.println("What operation? ('+', '-', '*', '/')");  
      System.out.println(" Enter 1 for Addition");
      System.out.println(" Enter 2 for Subtraction");
      System.out.println(" Enter 3 for Multiplication");
      System.out.println(" Enter 4 for Division");

      Calculator calc = new Calculator();
      System.out.println("Please Select the operation you wish to perform");
      Scanner input = new Scanner(System.in);
      int option = input.nextInt();
      // System.out.println("You selected the option perform");
      calc.calc(option);
      input.close();
  } 
}