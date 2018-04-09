package Trie;

//incomplete

import java.util.ArrayList;

public class myTrie {
	
	public static void main(String[] args) {

		
		
		trie root=new trie('#', true, true, null);
		
		
		String temp="Gaurav";
		System.out.println("Adding "+temp);
		
		root.addElement(root, temp.toCharArray());
		
		
		
	}
	
	
	
}







class trie{
	
	char val;
	boolean isLeaf;
	boolean isEnd;
	ArrayList<trie> children;
	trie parent;
	
	public trie(char val,boolean isLeaf,boolean isEnd,trie parent) {
		
		this.isEnd=isEnd;
		this.isLeaf=isLeaf;
		this.parent=parent;
		children=new ArrayList<>();
		this.val=val;
		
	}
	
	void addElement(trie root,char[] temp) {
	

		 
		trie ptr=root;
		
		for(int i=0;i<temp.length;i++) {
			
			char t=temp[i];
			
			trie newptr=new trie(t, true, true, ptr);
			
			ptr.children.add(newptr);
			newptr.parent=ptr;
			
			ptr.isEnd=false;
			ptr.isLeaf=false;
			ptr=newptr;
		
		}
			
	}
	
	void deleteElement() {
		
		
	}
	
	boolean checkElement(char c) {
		
		
		return false;
	}
	
	
	
	
	
}