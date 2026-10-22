import java.io.*;
class prog6{
public static void main(String ar[]){
Console c=System.console();
String s=c.readLine("Enter the number:");
int n1=Integer.parseInt(s);
int n2=n1<<2;
System.out.println("n1="+n1+"/t n2="+n2);
}
}