package sorting;

import java.util.ArrayList;
import java.util.Arrays;


public class MergeSort {

	static int a[]={5,1,6,4,2,3};
	static ArrayList<int[]> b=new ArrayList<int[]>();
	public static void main(String[] args) {
		mergeSort(a);
	}
	private static void mergeSort(int[] a2) {
		int j=0;
		for (j = 0; j < a2.length; j++) {
			b.add(new int[]{a2[j]});
		}
		
		
		int f=1;
		while(b.size()!=1){
		    b.set(0, mergeArrays(b.get(0), b.get(1)));
		    b.remove(1);
		    System.out.println("After "+f+"th run :");
		    System.out.println(Arrays.toString(b.get(0)));		   
		    f++;
		    System.out.println("\n");	
		}
		System.out.println(Arrays.toString(b.get(0)));
		//mergeArrays(a2,a3);
	}
	
	private static int[] mergeArrays(int[] a2, int[] b2) {
		int i=0,j=0,k=0,m=a2.length,n=b2.length;
		//ArrayList<Integer> c=new ArrayList<Integer>();
		int c[]=new int[m+n];
		while (i<m && j<n) {
			if(a2[i]<b2[j]){
				c[k]=a2[i++];
			}
			else if(a2[i]>b2[j]){
				c[k]=b2[j++];
			}
			k++;
		}
		if(i<m){
			for (int l = i; l < a2.length; l++) {
				c[k++]=a2[l];
			}
			
		}
		else if(j<n){
			for (int l = j; l < b2.length; l++) {
				c[k++]=b2[l];
			}
			
		}
		return c;
	}

}
