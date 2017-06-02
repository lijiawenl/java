package leetcode;
//decide whether tree a is the subtree of tree b
public class subTree {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	}
 boolean issubTree(TreeNode a,TreeNode b){
	boolean result = false;
	if(a!=null&&b!=null){
	 if(a.val == b.val){
		 result = testStructure(a,b);
	 }
	 if(!result){
		 result =testStructure(a.left,b);
	 }
	 if(!result){
		 result =testStructure(a.right,b);
	 }
	}
	return result;
}
 boolean testStructure(TreeNode a,TreeNode b){
	 if(b==null){//preorder of the tree/*********
		 return true;                  //********
	 }
	 if(a==null){
         return false;
	 
     }
	 if(a.val != b.val){
		 return false;}                //*******the root node is decided 
	
	 return testStructure(a.left, b.left)&&testStructure(a.right, b.right);// //*******the left and the right nodes are decided later;
	 }

 


}
