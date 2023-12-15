package SessionsOne;

import java.util.Scanner;

public class ScannerConcept {


  public static void main(String[] args) {
  
  System.out.println(" Enter your A value ");
  
  Scanner value = new Scanner(System.in);
  
  int A = value.nextInt();
  
  System.out.println(" Enter your B value ");
  
  int B = value.nextInt();
  
  System.out.println(" Thank you for entering the values  ");
  
  int c = A + B;
  
  System.out.println("  your addition output is " + c);
  
  }
  
  }
  
