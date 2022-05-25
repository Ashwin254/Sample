import java.util.*;
class Rank_Subset
{
	public static void main(String avi[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=sc.next().split(",");
		String s1[]=sc.next().split(",");
		String s2="";
		String s3="";
		for(int i=0;i<s.length;i++)
			s2+=s[i];
		for(int i=0;i<s1.length;i++)
			s3+=s1[i];
		ArrayList<String>a=new ArrayList<String>();
		for(int i=0;i<n;i++)
			a.add(s1[i]);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++)
				a.add(s1[i]+s1[j]);
		}
		int i;
		for(i=0;i<a.size();i++) {
			if(s2.equals(a.get(i)))
				break;
		}
		a.add(s3);
		System.out.println(s2);
		System.out.println(a.toString());
		System.out.println(i+2);
	}
}

