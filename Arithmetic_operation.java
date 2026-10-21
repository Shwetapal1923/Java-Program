import java.io.*;
class prog5{
public static void main(String ar[]){
Console c=System.console();
String s=c.readLine("Enter the first number:");
String k=c.readLine("Enter the second number:");
int a=Integer.parseInt(s);
int b=Integer.parseInt(k);
System.out.println("Addition is:"+(a+b));
System.out.println("Subtraction is:"+(a-b));
System.out.println("Multiplication is:"+(a*b));
System.out.println("Division is:"+(a/b));
System.out.println("Remainder is:"+(a%b));
}
}




