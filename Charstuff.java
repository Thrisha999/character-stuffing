import java.io.*; 
import java.lang.String; 
class Charstuff 
{ 
public static void main(String args[]) throws Exception 
{
String str=""; 
StringBuffer stuff; 
StringBuffer destuff; 
System.out.println("\t\t CHARACTER STUFF"); 
System.out.println("\n---Sender Side---"); 
System.out.println("enter the string:"); 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
str=br.readLine(); 
int i; 
stuff=new StringBuffer(str); 
int len=stuff.length(); 
for(i=0;i<len-1;i++) 
{ 
if(str.charAt(i)=='d'&&str.charAt(i+1)=='l'&&str.charAt(i+2)=='e') 
stuff.insert(i+3,"dle"); 
} 
stuff.insert(0,"dleetx"); 
stuff.append("dleetx"); 
System.out.println("\n stuffed data:"+stuff); 
destuff=new StringBuffer(); 
destuff.append(stuff.delete(0,6)); 
destuff.reverse(); 
destuff.delete(0,6); 
destuff.reverse(); 
for(i=0;i<destuff.length()-1;i++) 
{ 
if(destuff.charAt(i)=='d'&&destuff.charAt(i+1)=='l'&&destuff.charAt(i+2)=='e') 
{ 
if(destuff.charAt(i+3)=='d'&&destuff.charAt(i+4)=='l'&&destuff.charAt(i+5)=='e') 
destuff.delete(i+3,i+6); 
}
}
System.out.println("\t\t RECEIVER SIDE"); 
System.out.println("the destuffed data:"+destuff); 
} 
}