import java.util.*;
public class Project 
{
	public static void main(String[] args) 
	{
	   Scanner s=new Scanner(System.in);
	   int m=s.nextInt();
	   ArrayList<Integer> a=new ArrayList<>();
	   for(int i=0;i<m;i++) 
	   {
	      a.add(s.nextInt());
	   }
	   int d=0;
	   Collections.sort(a);
	   int n=a.size()-1;
	   for(int p=0;p<n;p++)
	   {
	   for(int i=0;i<1;i++)
	   {
		   int c=a.get(i)+a.get(i+1);
		   a.set(i,c);
		   a.remove(i+1);
		   d+=c;
		   //System.out.print(a);
	   }
	    }
	   System.out.println(d);
	}
}



