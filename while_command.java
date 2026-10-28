import java.io.*;
class prog14{
public static void main(String ar[]){
System.out.println("ar.length");
if(ar.length==0){
System.out.println("No command line argument given");
}
else{
int i=0;
while(i<ar.length){
System.out.println(ar[i]);
i++;
}
}
}
}
