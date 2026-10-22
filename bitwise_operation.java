import java.io.*;
class prog9{
public static void main(String ar[]){
Console c=System.console();
String s=c.readLine("Enter the first number:");
int n1=Integer.parseInt(s);
s=c.readLine("Enter the second number:");
int n2=Integer.parseInt(s);
int n3=n1/n2;
int n4=n1&n2;
int n5=n1^n2;
int n6=~n1;
System.out.println("n1="+n1+",n2="+n2);
System.out.println("n3="+n3);
System.out.println("n4="+n4+",n5="+n5+",n6="+n6);
}
}