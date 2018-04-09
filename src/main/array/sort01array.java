package main.array;

public class sort01array {
public static void main(String[] args) {
	
	int[]a={1,0,1,0,1,0,0,1,0,1};
	
	int n=a.length;
	int zero=0;
	for(int i=0;i<n;i++)
	if(a[i]==0)
		zero++;
	
		int l=0;
		int h=n-1;
		
		while(l<h){
			
			while(l<n && a[l]==0 && l<h)
				l++;
			
			while(h>=0 && a[h]==1 && l<h)
				h--;
			System.out.println(l+" "+a[l]+" "+h+" "+a[h]);
			
			//swap a[l] and a[h]
			
			int t=a[l];
			a[l]=a[h];
			a[h]=t;
			
			
		}
		
		
		
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
	
}
}
