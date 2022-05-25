import java.util.*;
public class Help_MLA 
{
public static void main(String[] args) 
{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int mid=(size/2);
		System.out.println(mid);
		int ans=0;
		int ans1=0;
		for(int i=0;i<=mid;i++)
			ans+=arr[i];
		for(int i=mid+1;i<size;i++)
			ans1+=arr[i];
		int max=Math.max(ans,ans1);
		int min=Math.min(ans,ans1);
		max=max*n;
		min=min*n1;
		System.out.println(ans+" "+ans1);
		System.out.println(Math.max(max,min));
}
}
