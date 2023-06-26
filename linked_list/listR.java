package linked_list;
public class listR {
	public static void call(node head,int count) {
		node temp=head;
		if(head==null) {
			return;
		}
       // count =count+1;
		System.out.print(temp.data+"  ");
        		System.out.println(count+"  ");

		call(head.next,count+1);
		
		
	}
	public static class node{
		int data;
		node next;
		
		node(int data) {
			this.data =data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =1;
		node a =new node(243);
		node b =new node(2354);
		node c =new node(2353);
		node d =new node(2356);
		node e =new node(23);
		node f =new node(238);
		node g =new node(263);
a.next =b;
b.next =c;
c.next=d;
d.next=e;
e.next=f;
f.next=g;

node temp =a;
call(temp,count);

	}

}