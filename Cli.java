import java.io.*;  
import java.net.*;  
import java.util.*;
public class Cli {  
public static void main(String[] args) {  
try{      
Socket s=new Socket("localhost",6666);  
DataInputStream ifs = new DataInputStream(s.getInputStream());
String st=(String)ifs.readUTF();
System.out.println(st);

DataOutputStream dos= new DataOutputStream(s.getOutputStream());
Scanner sc= new Scanner(System.in);
String word=sc.next();
dos.writeUTF(word);
s.close();
ifs.close();
}catch(Exception e){System.out.println(e);}
}
}