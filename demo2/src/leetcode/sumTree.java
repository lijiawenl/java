package leetcode;

import java.util.Deque;
import java.util.LinkedList;

import leetcode.depthTree.TreeNode;

public class sumTree {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	}
	static Deque<Integer> rootLine = new LinkedList<Integer>();
	static int cur = 0;
	void F(TreeNode root,int sum){
	if(root == null){
		return ;
	}
	rootLine.offer(root.val);
	cur =cur+root.val;
	boolean isleaf =(root.left==null && root.right==null);
	if(isleaf&& cur==sum){
		for(Integer z:rootLine){
			System.out.println(z);
		}
		return;
	}
	if(root.left!=null)F(root.left,sum);//不加上这个if是有问题的，不加相当于多一次迭代，相减会出问题
	if(root.right!=null)F(root.right,sum);
	int back =rootLine.pollLast();
	cur =cur -back; 
	}
}
	
	

