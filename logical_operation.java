import java.io.*;
class prog8{
public static void main(String ar[]){
Console c=System.console();
String s=c.readLine("Enter the first number:");
int k=Integer.parseInt(s);
s=c.readLine("Enter the second number:");
int l=Integer.parseInt(s);
s=c.readLine("Enter the third number:");
int m=Integer.parseInt(s);
Boolean d=(k<l)&&(l<m);
System.out.println(d);
}
}