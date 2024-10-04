package apnaclassjava;

import java.util.ArrayList;

import apnaclassjava.Lecture32preorder.Node;

public class Lecture33BST {

			static class Node
			{
				int data;
				Node left;
				Node right;
				
			Node(int data) // constructor
			   {
				this.data=data; 
				}
			}
		// funtion 	to insert  program 1
		public static Node insert (Node root,int val)
		{
			if (root==null) {
				root=new Node(val);
				return root; 
				}
			if (root.data>val) {
				// left subtree
				root.left=insert(root.left,val);
				}
			else {
				// right subtree
				root.right=insert(root.right,val);
				
			}
			return root;
		}
		
		 // in-order funtion ( code of inorder traversal)   program 1--> root will come in second  
		public static void inorder(Node root) {
			if (root==null) {
				return;
			}
			inorder(root.left);
			System.out.print(root.data +" ");
			inorder(root.right);
			
		}
			

		 // -----------Search funtion ( code of Search in BST )program 2 ------------------//
		public static boolean search(Node root,int key) {
			if (root==null) {
				return false;
			}
			
			if (root.data>key) {// left subtree
				return search(root.left,key);
				
			}
			else if(root.data==key) {
				return true;
			
			}
			else {
				return search(root.right,key);
			}
			
		}
		
// ------------delete funtion ( code of delete the  in BST ) program 3--------------------//
		public static Node delete(Node root,int val) {
			if (root.data>val) {
				root.left=delete(root.left,val);
			}
			else if (root.data<val) {
				root.right=delete(root.right,val);
			}
			else {// root.data==val
				// case 1
				if (root.left==null && root.right==null) {
					return null;
					
				}
				// case 2
				if (root.left==null) {
					return root.right;
					
				}
				else if (root.right==null) {
					return root.left;
				}
				// case 3  (important code)
				Node Is=inordersuccessor (root.right);
				root.data=Is.data;
				root.right=delete(root.right,Is.data);
				
			}
			return root;
			}
		
// ------------print in range funtion ( code of delete the  in BST ) program 4--------------------//
				public static void printInRange(Node root,int X,int Y) {
					if (root==null) {return;}
					
					//case 1
					if (root.data>=X && root.data<=Y) {
						printInRange(root.left,X,Y);
						System.out.print(root.data +" ");
						printInRange(root.right,X,Y);
						
					}
					// case 2
					else if (root.data>Y) {
						printInRange(root.left,X,Y);
						
					}
					// case 3
					else {
						printInRange(root.right,X,Y);
					}
				}
// ------------printRoot2Leaf funtion ( code of root to leaf path in BST ) program 5--------------------//
				public static void printPath(ArrayList<Integer>path) { 
					for (int i = 0; i <path.size(); i++) {
						System.out.print(path.get(i)+"-->");
						
					}
					System.out.println();
				}
				
				public static void printRoot2Leaf(Node root,ArrayList<Integer>path) {
					if (root==null) 
					{
						return;
					}
					path.add(root.data);
					//leaf
					if (root.left==null && root.right==null) {
						printPath(path);
						
					}
					else {// non leaf
						printRoot2Leaf(root.left,path);
						printRoot2Leaf(root.right,path);
					}
					path.remove(path.size()-1);
					
					}
					
					
	
			
			
	public static Node inordersuccessor(Node root) { // this left most node of right subtree
	// TODO Auto-generated method stub
		while (root.left!=null) {
			root= root.left;
		}
	return root;
}

	public static void main(String[] args) {
     // int  values[]= {5,1,3,4,2,7};  //program 1
	//	int  values[]= {8,5,3,1,4,6,10,11,14}; //program 2, 3,4,5 --> this can be used for program 2 to 5 
		int  values[]= {8,5,3,6,10,11,14}; //program 5
		
		// common 
      Node root=null;
      for (int i = 0; i < values.length; i++) {
    	  root=insert(root,values[i]);
		
	}
      // below code is for program 2
    //  inorder( root);
     // System.out.println();
      
      // below code is for program 2 i.e search funtion
      
      if (search(root,17)) {
    	  System.out.println("found");	
	}
      else {
    	  System.out.println("not found");	
		
	}
   // below code is for program 3
      
    //  delete(root,41);
    //  inorder( root);
      
   // below code is for program 4
      
 printInRange( root,3,8); // o/p will be value from 3 to 8
      
   // below code is for program 5
 printRoot2Leaf (root,new ArrayList<>());


	}

}
