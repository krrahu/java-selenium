package apnaclassjava;

public class Lecture27linkedlis {
	Node head;
	
	class Node {
		String data;
		Node next;
		
		Node(String data)
		{
			this.data=data;
			this.next=null;
		}
	}
	// add first
	public void addFirst(String data) {
		Node newNode=Node ();
		if (head==null) {
			head=newNode;
			return;
			
		}
		newNode.next=head;
		head=newNode;
		
	}
	
	private Node Node() {
		// TODO Auto-generated method stub
		return null;
	}

	// add last
		public void addLast(String data) {
			Node newNode=Node ();
			if (head==null) {
				head=newNode;
				return;	
			}
			Node currNode.next=head;
			while (currNode.next !=null) {
				currNode=currNode.next;
			}
			currNode.next=newNode;	
			}
			
		
		// print 
		public void printList() {
			if (head==null) {
				System.out.println("list is emapty");
				return;
				
			}
		Node currNode.next=head;
		while (currNode =!null) {
			System.out.print(currNode.data +" -->");
			currNode=currNode.next;
		}
		System.out.println("NULL");	
		}

		// delete first
		public void deletFirst() {
			if (head==null) {
				System.out.println("list is emapty");
				return;
				
			}
			head=head.next;
		}
		// delete last
				public void deletLast() {
					if (head==null) {
						System.out.println("list is emapty");
						return;
						
					}
					if (head.next==null) {
						head=null;
						return;
					}
					Node secondLast=head;
					Node lastNode=head.next;
					
					while (lastNode.next !=null) {
						lastNode=lastNode.next;
						secondLast=secondLast.next;
						
						
						
					}
					
						
					}
		
		
	public static void main(String[] args) {
		// 
		
		Lecture27linkedlis LL =new LL Lecture27linkedlis();
		LL.addFirst("a");
		LL.addFirst("is");
		LL.printList();
		
		LL.addLast("LL");
		LL.printList();
		
		LL.addFirst("this");
		LL.printList();
		
		LL.deletFirst();
		LL.printList();
		
		LL.deletLast();
		LL.printList();

	

}
	}
