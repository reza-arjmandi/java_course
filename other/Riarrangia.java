package lab15;

import java.util.Arrays;

public class Riarrangia {
	
	
	public static void main (String [] args) {
		
		int [] a =    {0,0,0,0};
		System.out.println(Arrays.toString(riarrangia(a)));
	}
	
	
	static int [] riarrangia (int [] array) {
		
		int [] negativeNumbers = negativeElements(array);
		int [] positiveNumbers = positiveElements(array);
		int [] resultArray = new int [array.length];
		int indexFinalArray =0; 
		int indexNegativeArray=0;
		int indexPositiveArray=0;
		while(indexFinalArray<array.length ) {
		    if(indexNegativeArray<negativeNumbers.length && negativeNumbers[indexNegativeArray]!=0) {
			    resultArray[indexFinalArray] = negativeNumbers[indexNegativeArray];
			    indexNegativeArray++;
			    indexFinalArray++;
		    }
		    if(indexPositiveArray<positiveNumbers.length && positiveNumbers[indexPositiveArray]!=0) {
		    	resultArray[indexFinalArray] = positiveNumbers[indexPositiveArray];
				indexPositiveArray++;
				indexFinalArray++;
		    }
		}
		return resultArray;
	}
	
	
	static int [] negativeElements (int [] array) {
		
		int index =0;
		int [] result = new int [array.length];
		for(int i=0; i<array.length; i++) {
		  if(array[i]<0) {
			  result[index] = array[i];
			  index++;
		  }
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
	
	
	static int [] positiveElements (int [] array) {
		
		int index =0;
		int [] result = new int [array.length];
		for(int i=0; i<array.length; i++) {
		  if(array[i]>0) {
			  result[index] = array[i];
			  index++;
		  }
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
}


