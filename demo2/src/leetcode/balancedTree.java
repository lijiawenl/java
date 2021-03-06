package leetcode;

import leetcode.deleteDuplecate.LinkedList;
import leetcode.depthTree.TreeNode;
//ppanduan erchashu shifoupinhheng;
public class balancedTree {
	class LinkedList{
		LinkedList next;
		int data;
	}
	// java method 1;
	boolean F(TreeNode root){
		if(root == null){
			return true;
		}
		int left =depthTree.f(root.left) ;
		int right =depthTree.f(root.right);
		if(left-right>1||left-right<1){
			return false;
		}
		return F(root.left)&&F(root.right);//the preorder the root value is decide by its left/rightchild;
		
	}
	//java
	//java method 2
	
	public int isBalanced2(TreeNode root){    
	       if(root == null) return 0;
	       int leftHeight = isBalanced2(root.left);
	       if(leftHeight == -1) return -1;//unbalanced
	       
	       int rightHeight = isBalanced2(root.right);
	       if(rightHeight == -1) return -1;//unbalanced
	       int height = leftHeight-rightHeight;
	       if(Math.abs(height) >1) return -1;//unbalanced
	       else{return Math.max(rightHeight, leftHeight)+1;}//left ,right,root 
	    		   
	}
	public boolean IsBalanced_Solution2(TreeNode root) {
        int check =  isBalanced2(root);
        if(check == -1){
            return false;
        }else{return true;}
    }
	
	
	//java method 3
	static boolean isbalanced =true;
	public int isBalanced3(TreeNode root){
		if(root == null) return 0;
		int left = isBalanced3(root.left);
		int right = isBalanced3(root.right);
		if(Math.abs(left-right)>1){
			isbalanced =false;
		}
		return Math.max(right, left)+1;
		
	}
	public boolean IsBalanced_Solution3(TreeNode root) {
        isBalanced3(root);
      return isbalanced;
    }
	      
	     
	   
		
		
}
