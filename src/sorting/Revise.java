package sorting;

public class Revise {

	static int a[]={1,2,3,4,5,6};//{5,1,6,2,4,3};
	public static void main(String Args){
		bubblesort(a);
	}
	public static void bubblesort(int b[]) {
		int noOfChanges=0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length-i-1; j++) {
				if(b[j]>b[j+1]){int temp=b[j];b[j]=b[j+1];b[j+1]=temp;noOfChanges++;}
				//if(noOfChanges<1){break;}
			}
		}
		System.out.println(noOfChanges);
	}
}
