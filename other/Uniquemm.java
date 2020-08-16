import java.util.Arrays;

public class Uniquemm {

	public static void main(String[] args) {
		
		int [] a = {20,11,15,41,23};

		int [] newA = notRepeatedNumbers(a);
		int arrayLength = numberOfElements(newA);
		int [] result = new int [arrayLength];
		int indice =0;
		for(int i=0; i<newA.length; i++) {
			if(newA[i]!=-1) {
				result[indice] = newA[i];
				indice++;
			}
		}
		System.out.println(Arrays.toString(result));  
	}
	
	
	
	static boolean IfIsEmpty(int [] array) {
		return (array.length==0);
	}
	
	
	
	static int [] notRepeatedNumbers (int [] a) {
		int [] emptyArray = new int [0];
		if(IfIsEmpty(a)) {
			return emptyArray;
		}
		else {
		for(int i=0; i<a.length; i++) {
			int number = a[i];
			for(int j=i+1; j<a.length; j++) {
				if(number==a[j]) {
					a[i] = -1;
					a[j] = -1;
				}
			}
		  }
		}
		return a;
	}

	
	
	
	static int numberOfElements (int [] array) { //2
		int count =0;
		for(int i=0; i<array.length; i++) {
			if(array[i]!=-1) {
				count++;
			}
		}
		return count; 
	}
}
