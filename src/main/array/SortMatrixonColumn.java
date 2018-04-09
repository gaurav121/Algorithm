package main.array;

public class SortMatrixonColumn {

	
	public static void main(String[] args) {
		
		int a[][]={
				{11,2,3},
				{9,5,6},
				{7,8,9}
				
		};
		
		
		for(int i=0;i<3;i++)
		{System.out.println();
		for(int j=0;j<3;j++)
			System.out.print(a[i][j]+" ");
		}
		
		
		int i,j,k,n=3;
		
		for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++){
					{
						if(a[i][0]>a[j][0])
						{
							//swap row i,j
						
							for(k=0;k<n;k++){
								
								int t=a[i][k];
								a[i][k]=a[j][k];
								a[j][k]=t;
								
							}
							
						
						
						}
					}
					
				}
			}
		
		for(int y=0;y<3;y++)
		{System.out.println();
		for(int u=0;u<3;u++)
			System.out.print(a[y][u]+" ");
		}
		
		
		
		
	}
}
