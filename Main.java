import java.util.*;
class Main 
{
	static int linearsearch(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
				return i+1;
		}
		return -1;
	}
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int res=linearsearch(arr,key);
		if(res==-1) {
			System.out.println("Key Not Found");
		}else {
			System.out.println("Key Found");
		}
	}
}



