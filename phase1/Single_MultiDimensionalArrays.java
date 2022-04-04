package chaithanya.java.assignment.com;

public class Single_MultiDimensionalArrays {
	
 public static void main(String[] args) {

		//single-dimensional array
		int a[]= {10,20,30,40,50};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		
			int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
			//printing 2D array  
			for(int i=0;i<3;i++){  
			 for(int j=0;j<3;j++){  
			   System.out.print(arr[i][j]+" ");  
			 }  
			 System.out.println();  
			}  
			}
 }  
