import java.util.Scanner;
class Seed
{
        public static void main(String args[]) 
        {    
		Scanner S=new Scanner(System.in);
           int count=0,t=0,prd=1;
		   int n=S.nextInt();
		   for(int i=(int)Math.sqrt(n);i<n/2;i++)
		   {
			   t=i;
			   prd=1;
			   while(t>0)
			   {
				   prd=prd*(t%10);
				   t=t/10;
			   }
			   if(prd*i==n)
				   count++;
		   }
		   System.out.println(count);
				   
        } 
    }
