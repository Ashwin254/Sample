import java.util.*;
class DoubleLinkedList
{
	class node
	{
		int data;
		node next,prev;
		node(int val)
		{
			data=val;
			next=null;
		}
	}
	node head,tail,safe;
	DoubleLinkedList()
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
			safe=tail;
			tail.next=newnode;
			tail=newnode;
			tail.prev=safe;
		}
	}
	public void display()
	{
		node itr;
		for(itr=head;itr!=null;itr=itr=itr.next)
			System.out.print(itr.data+" ");
	}
}
public class DoublyLinked_List 
{
	public static void main(String args[])
	{
		DoubleLinkedList obj=new DoubleLinkedList();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		obj.display();
	}
}


