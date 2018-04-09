package main.array;


//solution is to left rotate the given index from ranges matrix from end

public class FindElement_after_Ciscular_right_rotation {


	public static void main(String[] args) {
		
		int a[]={1, 2, 3, 4, 5};

		int ranges[][] = { {0, 2}, {0, 3} };
        int index =1;
		
        int row=ranges.length;
        System.out.println(row);
        
        int i=row-1;
        while(i>=0){
        
        	System.out.println("in while"+index);
        	if(index>=ranges[i][0] && index<=ranges[i][1])
        		index=leftroattion(index,ranges[i][0],ranges[i][1]);
        	      	
        	i--;
        }
        
		
        System.out.println("final calue  is "+a[index]);
		
		
	}

	private static int leftroattion(int index, int l,int r) {
		
		if(index==l)
		return r;
		
		return index-1;
		
	}
	
	
	
	
}
