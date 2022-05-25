import java.util.*;
class Store{
	String name;
	String roll;
	Store(String name,String roll){
		this.name=name;
		this.roll=roll;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
	}
}
public class Practice {
	public static void main(String args[]) {
		Store s=new Store("Alageesh","12");
		ArrayList<Store> a=new ArrayList<Store>();
		a.add(s);
		Store s1=new Store("Alageesh1","13");
		a.add(s1);
		//for(int i=0;i<a.size();i++)a.get(i).display();
		for(int i=0;i<a.size();i++) {
			if(a.get(i).name.equals("Alageesh")) {
				s=new Store("Bala","29"); 
				a.set(i,s);
			}
		}
		
		for(int i=0;i<a.size();i++)a.get(i).display();
	}
}
