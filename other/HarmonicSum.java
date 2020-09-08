import java.util.Scanner;

public class HarmonicSum {
	
     public static void main (String [] args) {
     Scanner scan = new Scanner (System.in);
     int x = scan.nextInt();
     scan.close();
     System.out.println(harmonicSum(x));
  }
     
     static int harmonicSum(int x) {
    	int n=1;
    	double totalHarmonicSum=0;
    	while(totalHarmonicSum<x && avanti(totalHarmonicSum,n,x)) {
    		totalHarmonicSum += sumOfEachSentence(n);
    		n++;
    	}
    	return n;
     }
     
     static boolean avanti(double totalHarmonicSum,int n, int x) {
    	return  totalHarmonicSum+sumOfEachSentence(n+1)<x;
     }
     
     static double sumOfEachSentence(int n) {
    	 double sigma = 0;
    	 for(int i=1; i<=n; i++) {
    		 sigma += (double)1/i; 
    	 }
    	 return sigma; 
     }
}