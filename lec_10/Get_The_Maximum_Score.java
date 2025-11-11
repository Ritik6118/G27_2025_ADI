package lec_10;

public class Get_The_Maximum_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {2,4,5,8,10};
		int [] arr2= {4,6,8,9}; 
		int a=maxSum(arr1,arr2);
		System.out.println(a);
	}

	public static int maxSum(int[] arr1, int[] arr2) {
		
		int i=0;
		int j=0;
		long si=0;
		long sj=0;
		long sum=0;
		int mod=100000007;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				si+=arr1[i];
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				sj+=arr2[j];
				j++;
			}
			else { 
				sum+=Math.max(si, sj);
				sum+=arr1[i];
				si=0;
				sj=0;
				i++;
				j++;
			}
		}
		while(i<arr1.length) {
			si+=arr1[i];
			i++;
		}
		while(j<arr2.length) {
			sj+=arr2[j];
			j++;
		}
		sum+=Math.max(si, sj);
		sum%=mod;
		return (int)(sum);
	}

}
