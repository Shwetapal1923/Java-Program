import java .io.*;
class prog11{
public static void main(String ar[]){
Console c=System.console();
String s=c.readLine("Enter the number:");
int i=Integer.parseInt(s);
if(i%2==0){
System.out.println("X:i is even number");
}
else
System.out.println("X:i is odd number");
}
}
