

public class ss {
	

public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
int b=0;
int count =0;
int a=n;
int c=0;
int t=0;
while(n!=0)
{
	b=(n%10);
	count++;
	n=n/10;
}
while(a!=0)
{
t=a%10;
	c=c+(int) (Math.pow(t,count));
	
	a=a/10;
}

System.out.println(c);



}

}
