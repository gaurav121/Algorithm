/**
 * 
 */
package practice.Algorithm;

/**
 * @author gyadav
 *
 */
public class AlternatePositiveNegetiveArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {-1, 2, 3, 1, -2, -3,-9,-8,-11,4,5,6,7,8,9,10};
		
		int i=0,n=arr.length,temp,k;
		
		
		for(i=0;i<n;i++) {
			
			if(i%2==1) {
				if(arr[i]>=0) {
					for(k=i+1;k<n && arr[k]>=0;k++) {
						
					}
					if(k<n) {
					temp=arr[i];
					arr[i]=arr[k];
					arr[k]=temp;
					}
				}
				
			}
			
			else {
				
				if(arr[i]<0) {
					for(k=i+1;k<n && arr[k]<0;k++) {
						
					}
					
					if(k<n) {
					temp=arr[i];
					arr[i]=arr[k];
					arr[k]=temp;
					}
				}
			
		
			}
	
		}
		
		for(i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
	}
}
