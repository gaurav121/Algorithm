package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeSet;

class Maxlevel{
	
	int maxlevel;
}

public class TreeNode {

	int value;
	TreeNode left;
	TreeNode right;
	int d;
	
	int maxlevel=1;

	
	public TreeNode(int v) {
		value=v;
		left=null;
		right=null;
	}
	
	public TreeNode() {
		// TODO Auto-generated constructor stub
	}
	
	public TreeNode(int v , TreeNode l,TreeNode r,int d2) {
		value=v;
		d=d2;
		left=l;
		right=r;
		
	}

	

	public TreeNode createnewNode(int value){
		
		TreeNode t=new TreeNode(value);
		
		return t;
	}
	
	public void addNode(TreeNode root,int value){
		
			
		
		TreeNode ptr=new TreeNode();
		TreeNode nptr=new TreeNode(value);
		
		
		if(root==null)
		{
			root=nptr;
			return;
		}
		
		
		ptr=root;
		
		while(ptr!=null)
		{
			if(ptr.value>value){
				
				if(ptr.left==null)
				{
					ptr.left=nptr;
					return;
					
				}
				ptr=ptr.left;
				
				
			}
			else{
				
				if(ptr.right==null){
					ptr.right=nptr;
					return;
					
				}
				ptr=ptr.right;				
			}
				
		}
	}
	
	
	void showTree(TreeNode node){
		
		if(node==null){
			return;
		}
		showTree(node.left);
		System.out.print(node.value+" ");
		showTree(node.right);
	}

	public void showLeftView(TreeNode node, int level, Maxlevel maxlevel) {

		//System.out.println("in showleft  \n"+level+" "+maxlevel);
		if(node==null)
			return ;
		
		if(maxlevel.maxlevel<level)
			{
			
			System.out.println("Max levele"+maxlevel.maxlevel+" node is "+node.value+" ");
			maxlevel.maxlevel=level;
			showLeftView(node.left, level+1,maxlevel);
			showLeftView(node.right, level+1,maxlevel);
		
		
			}		
		
		
		
	}
	
	
	public void showRightView(TreeNode node, int level, Maxlevel maxlevel) {

		//System.out.println("in showleft  \n"+level+" "+maxlevel);
		if(node==null)
			return ;
	
		
		if(maxlevel.maxlevel<level)
		{
			System.out.println(node.value);
			maxlevel.maxlevel++;
			
			showRightView(node.right, level+1, maxlevel);
			showRightView(node.left, level+1, maxlevel);
			
			
		}
		
	}

	
	

	
	public void showTreeQueue(TreeNode root) {

		Queue<TreeNode> queue=new LinkedList<>();
		
		queue.add(root);
		
		TreeNode ptr;
		
		while(!queue.isEmpty()){
			
			ptr=queue.poll();
			
			if(ptr.left!=null){
				queue.add(ptr.left);
			}
			System.out.println("Element is "+ptr.value);
			
			if(ptr.right!=null){
				queue.add(ptr.right);
			}
			
			
			
			
		}
		
		
	}
	
	public void showTopView(TreeNode root, int i) {
		//use treeset and a queue  with new class
	HashMap<Integer, Integer> hashMap=new HashMap<>();
	
	List<TreeNode> list=new LinkedList<>();
		
	}
		
		
		
		
		
	

	

}
