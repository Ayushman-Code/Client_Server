import java.io.*;  
import java.net.*;  
import java.util.*;
public class Ser {  
public static void main(String[] args)
{ 
try
{
ServerSocket ss=new ServerSocket(6666);  
Socket s=ss.accept();  
DataOutputStream dos= new DataOutputStream(s.getOutputStream());
Scanner sc= new Scanner(System.in);
String word=sc.next();
dos.writeUTF(word);

DataInputStream ifs = new DataInputStream(s.getInputStream());
String str=(String)ifs.readUTF();
System.out.println(str);
System.out.println("Connection End");
ss.close();  
dos.close();

}catch(Exception e){System.out.println(e);}  
}
}