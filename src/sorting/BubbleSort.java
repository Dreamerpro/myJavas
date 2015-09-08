package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
			int a[]={5,4,1,6,2,3};//{1,2,3,4,5,6};
			int totalLoops=0;
			
			System.out.println(Arrays.toString(a));
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length-i-1; j++) {
					if(a[j]>a[j+1]){
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
						totalLoops++;
					}
				}
				if(totalLoops<1){
					break;
				}
			}
			System.out.println(Arrays.toString(a));
			System.out.println("Total Loops: "+totalLoops);
	}

}
