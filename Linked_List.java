import java.util.*;
class LinkedList
{
	class node
	{
		int data;
		node next;
		node(int val)
		{
			data=val;
			next=null;
		}
	}
	node head,tail;
	LinkedList()
	{
		head=null;
	}
	public void insert(int data)
	{
		node newnode=new node(data);
		if(head==null) {
			head=newnode;
	        tail=newnode;
		}else {
			tail.next=newnode;
			tail=newnode;
		}
	}
	public void display()
	{
		node itr;
		for(itr=head;itr!=null;itr=itr=itr.next)
			System.out.print(itr.data+" ");
	}
}
public class Linked_List 
{
	public static void main(String args[])
	{
		LinkedList obj=new LinkedList();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		obj.display();
	}
}

