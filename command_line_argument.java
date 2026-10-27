import java.io.*;
class prog13{
public static void main(String ar[]){
System.out.println(ar.length);
if(ar.length==0){
System.out.println("No command line argument  given");
}
else{
for(int i=0;i<ar.length;i++)
System.out.println(ar[i]);
}
}
}