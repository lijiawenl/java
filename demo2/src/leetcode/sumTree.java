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
	if(root.left!=null)F(root.left,sum);//���������if��������ģ������൱�ڶ�һ�ε���������������
	if(root.right!=null)F(root.right,sum);
	int back =rootLine.pollLast();
	cur =cur -back; 
	}
}
	
	
