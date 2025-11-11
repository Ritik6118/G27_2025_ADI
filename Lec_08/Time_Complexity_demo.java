package Lec_08;

public class Time_Complexity_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long st=System.currentTimeMillis();
		int a=0;
		int b=1;
		int n=100000;
		for(int i=0;i<n;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
		long ed=System.currentTimeMillis();
		System.out.println();
		System.out.println(ed-st +"< time consumed " );
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<10;j++) {
				System.out.println("hello");
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("hello");
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.println("hello");
			}
		}
	}

}
