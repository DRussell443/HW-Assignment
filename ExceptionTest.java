/** 
Dominic Russell
Algorithm Workbench ch.11 #1
*/ 
 
public class ExceptionTest {
public static void main(String[] args) {
int number; String str;
try {
str = "xyz";
number = Integer.parseInt(str); System.out.println("A");
}
catch(NumberFormatException e) {
System.out.println("B"); }
catch(IllegalArgumentException e) {
System.out.println("C"); }
System.out.println("D"); }
}


// This code will print the letters "B" and "D"