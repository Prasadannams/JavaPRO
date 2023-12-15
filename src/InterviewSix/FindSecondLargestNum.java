package InterviewSix;

public class FindSecondLargestNum {

	public static void main(String[] args) {

		
		int a[]= {20,10,30,40,50};
		int temp;
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.println("second largest number in array  : "  + a[1]);
	}

}
