class Repeat
{
public static void main(String args[])
{
	int a[]=new int[args.length];
	for(int i=0;i<args.length;i++)
	a[i]=Integer.parseInt(args[i]);
 int rep=0;
	 for(int i=0;i<args.length;i++)
	 {
		 for(int j=i+1;j<args.length;j++)
		 
			 if(a[i]==a[j])
			 {
				 rep=1;
				 System.out.println("1st Repeat="+a[i]);
				 break;
			 }
			 }
			 if(rep==0)
			 {
			 
				 
				 System.out.println("No-Repeat");
			 }
			 
}
}
		 
