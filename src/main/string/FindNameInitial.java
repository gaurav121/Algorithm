package main.string;

public class FindNameInitial {
		public static void main(String[] args) {
	
			String  a="Gaurav Singh yadav Anna";
			
			int flag=1;
			
			for(int i=0;i<a.length();i++){
				if(flag==1)
					System.out.print(a.charAt(i)+" ");
					
				if(a.charAt(i)==' ')
					flag=1;
				else 
					flag=0;
			}
			
			
	

		}
}
