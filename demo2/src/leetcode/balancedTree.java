package leetcode;

import leetcode.deleteDuplecate.LinkedList;
import leetcode.depthTree.TreeNode;
//ppanduan erchashu shifoupinhheng;
public class balancedTree {
	class LinkedList{
		LinkedList next;
		int data;
	}
	boolean F(TreeNode root){
		if(root == null){
			return true;
		}
		int left =depthTree.f(root.left) ;
		int right =depthTree.f(root.right);
		if(left-right>1||left-right<1){
			return false;
		}
		return F(root.left)&&F(root.right);//the afteorder the root value is decide by its left/rightchild;
		
	}
	//java ��ֵ���ݣ������ôд��������������ģ�c++���԰��յ�ַ���ݡ�
	//java ������չ���TreeNode �࣬��һ������depth,�����
	public boolean isBalanced2(TreeNode root){    
	       int depth = 0;    
	       return isBalanced2(root,depth);    
	   }    
	   public boolean isBalanced2(TreeNode root,int depth){    
	       if(root == null){    
	           depth = 0;    
	           return true;    
	       }    
	       int left = 0,right = 0;    
	       if(isBalanced2(root.left,left) && isBalanced2(root.right,right)){    
	           int diff = left-right;    
	           if(diff <= 1 && diff >= -1){    
	               depth = 1+(left > right?left : right);    
	               return true;    
	           }    //����ı������ݺ���֡�
	       }    
	       return false;    
	   } 
		
		
}