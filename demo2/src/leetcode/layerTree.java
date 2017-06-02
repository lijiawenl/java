package leetcode;

import java.util.Deque;
import java.util.LinkedList;

import leetcode.subTree.TreeNode;

public class layerTree {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	}
	
	void f(TreeNode root){
		if(root == null){
			return;
		}
		Deque<TreeNode> m = new LinkedList<TreeNode>();
		m.offer(root);
		while(!m.isEmpty()){
			TreeNode temp =m.poll();
			System.out.println(temp);
			if(temp.left!=null){
				m.offer(temp.left);
			}
			if(temp.right!=null){
				m.offer(temp.right);
			}
			
		}
			
	}
}
