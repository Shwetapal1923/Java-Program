import java.io.*;
class prog13{
public static void main(String ar[]){
Console c=System.console();
String s=c.readLine("Enter the number:");
int i=Integer.parseInt(s);
switch(i){
case 1:
System.out.println("i is 1");
break;
case 2:
System.out.println("i is 2");
break;
case 3:
System.out.println("i is 3");
break;
default:
System.out.println("i is greater than 3");
}
}
}