package main.string;

public class FindFirstRepeated {

	
	public static void main(String[] args) {
		
		String a="gaugav";
		
		
		int hash[]=new int[26];
		
		
		for(int i=0;i<a.length();i++){
			
			char t=a.charAt(i);
			int tt=(t-'a');
			if(hash[tt]==0)
				hash[tt]=1;
				else
				{
					System.out.println("First repeated found "+t);
					break;
				}
				
			
			
		}
		
	}
}
