package tree;

public class TreeLeftView {

	public static void main(String[] args) {
	
		
		TreeNode root=new TreeNode(6);
		root.addNode(root, 4);
		root.addNode(root, 7);
		root.addNode(root, 3);
		root.addNode(root, 2);
		root.addNode(root, 8);
		root.addNode(root, 9);
		root.addNode(root, 1);
		
		root.showTree(root);
		
		
		Maxlevel maxlevel=new Maxlevel();
		maxlevel.maxlevel=0;

		System.out.println("Left view is :");
		root.showLeftView(root,1,maxlevel);
		
		System.out.println("Right view is :");
		root.showRightView(root,1,maxlevel);
		
		System.out.println("Queue view is :");
		root.showTreeQueue(root);
		
		
	
	}

}
