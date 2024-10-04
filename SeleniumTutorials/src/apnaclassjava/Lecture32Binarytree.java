package apnaclassjava;

// program for build tree preorder with null value i.e -1 last leaf
public class Lecture32Binarytree {
	
	static class Node {// funtion 
	
		int data;
		Node left ;
		Node right;
		
		Node(int data) { // contructor used for intialization
		this.data=data;
		this.left=null;
		this.right=null;
		}
	}

// craeeting one class i.e Binarytree and indise it one function i.e bildtree (here in function it will stores of nodes values)
	static class Binarytree
	{
		static int indx=-1;
		public static Node bildTree(int nodes[])
		{ 
			indx++; //once the bildTree funtion will call it will increase the value frpm -1 to 0
			
			if (nodes[indx]==-1) {
				return null;
			}
			// for othere nodes now we create object of Node class  and store the values in newnode
			Node newnode=new Node(nodes[indx]); // 
			newnode.left=bildTree(nodes);
			newnode.right=bildTree(nodes);
			return newnode;
			
		}
		// inorder funtion ( code of inorder traversal)
		public static void inorder(Node root) {
			if (root==null) {
				return;
			}
			inorder(root.left);
			System.out.print(root.data +" ");
			
			inorder(root.right);
			
		}
	}
	
	public static void main(String[] args) {
		// 
int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
Binarytree tree =new Binarytree();
Node root=tree.bildTree(nodes); 
System.out.println(root.data);  // printing data of root 
inorder(root); // inorder funtion --> need to check for error 
		

	}

}
