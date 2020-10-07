package exercise2;

import java.util.Scanner;

public class Circle { 
public static void main(String[] args) {
System.out.println("r:");
        Scanner input = new Scanner(System.in);


  int r = input.nextInt();
  double п = 3.14;
  double C = (2.0*п*r);
  double A = (п*r);
System.out.println("circumstance"+ C);
System.out.println("Area" + A);
}
}