import java.util.Stack;

public class visitTree {

	//钱，中，后序遍历树的形式；
	class TreeTreeNode{
		int val;
		TreeTreeNode left;
		TreeTreeNode right;
	}
	//递归版本
	void F(TreeTreeNode root){
		if(root==null)return;
		 visit(root);
		F(root.left);
		F(root.right);
		
	}
	void F1(TreeTreeNode root){
		if(root==null)return;
		 visit(root);
		F(root.left);
		 visit(root);
		F(root.right);
		
	}
	void F2(TreeTreeNode root){
		
		if(root==null)return;
	 
		F(root.left);
		F(root.right);
		visit(root);
	}
	//非递归的版本
	
	void Fr(TreeTreeNode root){
		Stack<TreeTreeNode> s = new Stack<TreeTreeNode>();
		TreeTreeNode TreeNode =root;
		while(root!=null||!s.isEmpty()){
			if(root!=null){
				visit(root);
				s.push(TreeNode);
				TreeNode =TreeNode.left;
			}else{
				TreeNode = s.pop();
				TreeNode = TreeNode.right;
			}
		}
	}
	void F1r(TreeTreeNode root){
		Stack<TreeTreeNode> s = new Stack<TreeTreeNode>();
		TreeTreeNode TreeNode =root;
		while(root!=null||!s.isEmpty()){
			if(root!=null){
				s.push(TreeNode);
				TreeNode =TreeNode.left;
			}else{
				TreeNode = s.pop();
				visit(root);
				TreeNode = TreeNode.right;
			}
		}
	}
	
	public void F2r(TreeTreeNode root) {   //后序遍历
		Stack<TreeTreeNode> stack = new Stack<TreeTreeNode>();
		Stack<TreeTreeNode> output = new Stack<TreeTreeNode>();//构造一个中间栈来存储逆后序遍历的结果
		TreeTreeNode Node = root;
		while (Node != null || stack.size() > 0) {
			if (Node != null) {
				output.push(Node);
				stack.push(Node);				
				Node = Node.right;
			} else {
				Node = stack.pop();				
				Node = Node.left;
				
			}
		}
		while (output.size() > 0) {
			visit(output.pop());
		}
	}
	void visit(TreeTreeNode m){
		
	}
	
	
}
