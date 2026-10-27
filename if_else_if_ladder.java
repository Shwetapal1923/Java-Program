import java.io.*;
class prog12{
public static void main(String ar[]){
Console c=System.console();
String s=c.readLine("Enter the number:");
int age=Integer.parseInt(s);
if(age>80){
System.out.println("You are very old");
}else if(age>60){
System.out.println("You are old");
}
else if(age>40){
System.out.println("You are becoming old");
}
else if(age>20){
System.out.println("You are young");
}
else
System.out.println("You are child");
}
}