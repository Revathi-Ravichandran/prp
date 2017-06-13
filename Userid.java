import java.util.Scanner;
class Userid
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
String fir=S.next();
String last=S.next();
String id=S.next();
int n=S.nextInt();
String temp=" ";
if(fir.length()>last.length())
{
temp=fir;
fir=last;
last=temp;
}
if(fir.length()==last.length())
{
if(fir.compareTo(last)>0)
{
temp=fir;
fir=last;
last=temp;
}
}
temp=" ";
temp=temp+last.charAt(0)+fir+id.charAt(n-1)+id.charAt(id.length()-n);
System.out.println(temp.trim());
}
}
