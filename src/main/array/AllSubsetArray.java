package main.array;

//kinda ratta : http://codesam.blogspot.in/2011/03/find-all-subsets-of-given-set.html

public class AllSubsetArray {

	public static void main(String[] args) {
		
		int a[]={1,2,3};
		int n=1<<a.length;
		
		System.out.println(n);
		
		
        int i; 
		int bit, pos;
        
        
		for(i=0;i<n;i++){
			
			bit=i;
			pos=a.length-1;
			System.out.print("{ ");
			while(bit>0){
				
				if( (bit&1)==1)
						System.out.print(a[pos]+", ");
					pos--;
					bit>>=1;
			
				
				
			}
		System.out.print("}");
			
			
			
			
			
		}
		
		
	}
	
	
}
