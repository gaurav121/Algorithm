package main.array;

public class MatrixRotate {

	
	//take transpose from diagnoal
	//then reverse every column
	
	public static void main(String[] args) {
		
		int a[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		
		
		for(int i=0;i<3;i++)
		{System.out.println();
		for(int j=0;j<3;j++)
			System.out.print(a[i][j]+" ");
		}
		
		
		
		//transpose
		for(int i=0;i<3;i++){
			for(int j=i;j<3;j++)
			{
				//swap(a[i][j],a[j][i]);
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
				
		
		}
		//transpose2 
		for(int i=0;i<3;i++){
			for(int j=i;j<3;j++)
			{
				//swap(a[i][j],a[j][i]);
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
				
		
		}

		
		System.out.println("After Transpose");
		
		for(int i=0;i<3;i++)
			{System.out.println();
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			}
			
		
		for(int c=0;c<3;c++){
			for(int r=0;r<=3/2;r++)
			{
				//swap a[r][c] and a[n-r-1][c]
				int t=a[r][c];
				a[r][c]=a[3-r-1][c];
				a[3-r-1][c]=t;
				
				
				
			}
			
			
		}
		
		
System.out.println("After Reverse");
		
		for(int i=0;i<3;i++)
			{System.out.println();
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			}
			
		
		
		
	}

}
