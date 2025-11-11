package Lec_08;

public class Fixed_length_Sliding_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,8,9,2,8,6,7,5,4,3,2,1};
		int k=3;
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		int ans=sum;
//		int st=0;
		for(int i=k;i<arr.length;i++){
			int ed=i;
			int st=i-k;
			sum+=arr[ed];
			sum-=arr[st];
			ans=Math.max(ans, sum);
		}
		System.out.println(ans);
	}

}
