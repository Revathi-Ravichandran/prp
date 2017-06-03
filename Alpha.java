class Alpha
{
public static void main(String args[])
{
	int a=Integer.parseInt(args[0]);
	int len=0,n=a;
	while(n>0)
	{
		len++;
		n=n/10;
	}
	n=a;
	int count=1,temp,no=0,t=0,t1=0,c=0;
	while(c<len-1)
	{
		t=n%10;
		n=n/10;
		t1=n%10;
		temp=t1*10+t;
		//System.out.println(temp);
		if(temp>26)
			no++;
		else
			count++;
		c++;
	}
	//System.out.println(len+" "+no);
	if(no>1&&no!=len-1)
	{
	for(int i=0;i<(len/2-no+1);i++)
		count++;
	//System.out.println("if1");
	}
	if(no==1&&no!=len-1)
	{
		for(int i=0;i<(len/2-no);i++)
		count++;
	//System.out.println("if2");
	}
	if(no==0&&no!=len-1)
	{
		for(int i=0;i<len/2;i++)
			count++;
		//System.out.println("if3");
	}
		System.out.println(count);
		
}
}
