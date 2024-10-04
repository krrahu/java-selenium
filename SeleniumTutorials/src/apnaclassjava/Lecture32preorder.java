package apnaclassjava;
import java.util.LinkedList;
import java.util.Queue;

import apnaclassjava.Lecture32Binarytree.Binarytree;
import apnaclassjava.Lecture32Binarytree.Node;

public class Lecture32preorder {
// program for build tree preorder without null value  i.e without -1 last leaf  (23 min )

		
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
	// Preorder funtion ( code of Preorder traversal without null value ) --> root will come first 
		public static void preOrder(Node root) {
			
		if (root==null) {
			return;
		}
		System.out.print(root.data +" ");
		preOrder(root.left);
		preOrder(root.right);
}
		
 // in-order funtion ( code of inorder traversal)   --> root will come in second  
				public static void inorder(Node root) {
					if (root==null) {
						return;
					}
					inorder(root.left);
					System.out.print(root.data +" ");
					inorder(root.right);
					
				}
// post-order funtion ( code of postorder traversal)   --> root will come in last   
				public static void postorder(Node root) {
					if (root==null) {
						return;
					}
					postorder(root.left);
					postorder(root.right);
					System.out.print(root.data +" ");
		}	
				
// level-order funtion ( code of level order traversal)   --> root will come in last   
				public static void levelOrder(Node root) 
				{
					if (root==null) {
						return;
					}
				Queue<Node>q=new LinkedList<>(); // creating queue and added the values i.e root node and null 
				q.add(root);
				q.add(null);
				// now we are ruuning loop till it got empty
				while (!q.isEmpty()) {
					// finding the current node  and if currenrt node is null then print nextline and if it is empty  break it else add the null value 					
					Node currnode=q.remove(); 
					if (currnode==null) { 
						System.out.println();
						
						if (q.isEmpty()) {
							break;
							
						} else 
						{
							q.add(null);
						}
						
					}
	// if current node is not null it come to else part below code			
					else 
					{
						System.out.print(currnode.data +" "); // printing the data to currnode and we will check left and right  data if it not null we add it in queue 
						if (currnode.left!=null) {
							q.add(currnode.left);
							
						}
						if (currnode.right!=null) {
							q.add(currnode.right);
							
						}
						
					}
					
				}
				
					
				}
// count funtion ( code of count of nodes)    
				public static int  countofNodes(Node root) {
					if (root==null) {
						return 0;
					}
					int leftnode= countofNodes(root.left);
					int rightnode=countofNodes(root.right);
					return leftnode +rightnode+1;
		}
				
				// sum of nodes funtion ( code of sum of nodes )    
				public static int  sumofNodes(Node root) {
					if (root==null) {
						return 0;
					}
					int leftsum= sumofNodes(root.left);
					int rightsum=sumofNodes(root.right);
					return leftsum +rightsum+ root.data;
		}
		// height of a tree  funtion ( code of height of a tree  )    
				public static int  height(Node root) {
					// base case value
					if (root==null) {
						return 0;
					}
					
					int leftheight= height(root.left);
					int rightheight=height(root.right); 
					int totalheight= Math.max(leftheight, rightheight)+ 1;
					return totalheight;
		}
				
				// diameter of a tree  funtion ( code of diameter of a tree  )  
				// time complexity is n of n not lineaer  --> Approach 1
				public static int  diameter(Node root) {
					// base case is  if root value at any point becomes null then diameter length will return 0 
					if (root==null) {
						return 0;
					}
					
					int diam1= diameter(root.left);  // Longest root of left side (LS)
					int diam2=diameter(root.right);  // Longest root of rigth side (RS)
					int diam3=height(root.left)+height(root.right) +1;  // LS +RS+1 here we calling height funtion
					
		
					return Math.max(diam3, Math.max(diam1, diam2));
		}
				
				// diameter of a tree  funtion ( code of diameter of a tree  )  
				// time complexity is 0(n) it is lineaer  --> Approach 2 
				
				static class Treeinfo{
					int ht;
					int diamt;
					
					Treeinfo(int ht,int diamt){
						this.ht=ht;
						this.diamt=diamt;
						
					}
					
				}
				public static Treeinfo diameter2(Node root)
				{
		// base case is at any point if root value  becomes null then it will return Treeinfo with values 0 
					if (root==null) {
						return new Treeinfo(0,0); // if don't return it throw run time error
					}
					Treeinfo left=diameter2(root.left); // we have take out left tree information
					Treeinfo right=diameter2(root.right); // we have take out right tree information
					int myheight=Math.max(left.ht, right.ht+1); // max height 
					// finding diamtere 
					int diam1=left.diamt;
					int diam2=right.diamt;
					int diam3=left.ht+ right.ht+1;
					
					int mydiam=Math.max(Math.max(diam1, diam2),diam3);
					// creating object of treeinfo statis class and passing the myheight and mydiam values
					Treeinfo myinfo=new Treeinfo(myheight,mydiam);
					return myinfo;
				}
				

		
public static void main(String[] args) {
			// 
	int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
	Binarytree tree =new Binarytree();
	Node root=tree.bildTree(nodes); 
	//System.out.println(root.data);  // printing data of root 
	//preOrder(root); // preOrder 
	//in-order(root); // in-order function
	//post order(root); // post order function
	//levelOrder(root);//levelOrder function 
	//System.out.println(countofNodes(root));  // count of nodes function
	//System.out.println(sumofNodes(root));  // sum of nodes function
	//System.out.println(height(root));  // height function 
	//System.out.println(diameter(root)); // diameter funtion
	System.out.println(diameter2(root).diamt); // diameter2 funtion
	
}

	}}
