import java.io.*;
class prog9{
public static void main(String ar[]){
Console c=System.console();
String s=c.readLine("Enter the number:");
int n=Integer.parseInt(s);
System.out.println(n*n);
System.out.println(n*n*n);
}
}