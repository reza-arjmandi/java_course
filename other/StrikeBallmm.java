import java.util.Arrays;
import java.util.Scanner;

public class StrikeBallmm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
        scan.close();
        int strike = strike(n,m);
        int ball = ball(n,m)-strike;
        int [] result = new int [2];
        result [0] = strike;
        result [1] = ball;
        System.out.println(Arrays.toString(result));
        
	}
	
	
	static int ball (int a, int b) {
		int [] frequenceArrayA = frequenceOfNumbers(a); 
		int [] frequenceArrayB = frequenceOfNumbers(b); 
		int s = numbersCommon(frequenceArrayA,frequenceArrayB); 
		return s;
	}
	
	static int numbersCommon (int [] a, int [] b) {  
		int count =0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==0 || b[i]==0) {
				count = count +0;
			}
			if(a[i]>=b[i]) {
				count = count +b[i];
			}
			if(a[i]<b[i]) {
				count = count + a[i];
			}
		}
			return count;
	
	}
	
	static int [] frequenceOfNumbers (int a) {
		int [] arrayFrequences = new int [10];
		while(a>0) {
		   arrayFrequences [a%10]++;
		   a = a/10;
		}
		return arrayFrequences;
	}
	
	
	
	static int strike(int n, int m) { 
		int count =0;
		while(n>0) {
			if(n%10==m%10) {
				count++;
			}
			n = n/10;
			m = m/10;
		}
		return count;
	}

}
