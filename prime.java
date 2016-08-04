# bharathii
import java.util.*;
import java.util.Arrays;

public class prime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		int k=0;
		System.out.println("enter no:");
		int a=s.nextInt();
		System.out.println("enter initial:");
		int b=s.nextInt();
		System.out.println("enter limit:");
		int c=s.nextInt();
		int []y=new int[100];
		for(int i=b;i<=c;i++)
		{
			int flag=0;
			if(i==2)
			{
				
				flag=1;
			}
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				
			     }
				else
		    	{
					flag=1;
					}
			}
				if(flag==1)
				{
					y[k]=i;
					System.out.println(y[k]);
					k++;
				}}
		for(int o=0;o<y.length;o++)
		{
			int z=y[o];
				while(y[o]!=0)
				{
				if(y[o]%10==a)
				{
					count++;
				}
				y[o]=y[o]/10;
				
			}
		}
		System.out.println(count);
	}}

