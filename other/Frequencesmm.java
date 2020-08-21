import java.util.Arrays;

public class Frequencesmm {
	
	public static void main (String [] args) {
		int [] input =   {3,5,6,2};
		System.out.println(Arrays.toString(frequences(input)));
	}

	
	static int [] frequences (int [] array) {
		
		int [] sortedArray = Sort(array); 
		int finalArrayLength=1;
		for(int i=0; i<sortedArray.length-1; i++) {
			if(sortedArray[i]!=sortedArray[i+1]) {
				finalArrayLength++;
			}
		}
		int [] result = new int [finalArrayLength];
		result = numberOfRepeatForEachElement(sortedArray,finalArrayLength);
		return result;
	}
	
	
    static int [] Sort (int [] a) {  
		
		int indice,temp;
		for(int i=0; i<a.length; i++) {
		int min = a[i];
		indice = i;
			for(int j=i+1; j<a.length; j++) {
		       if(a[j]<min) {
		    	   min = a[j];
		    	   indice = j;
		       }
			}
			temp = a[i];
			a[i] = a[indice];
			a[indice] = temp;	
	    }
		return a;
	}
    
    
    static int [] numberOfRepeatForEachElement (int [] array, int length) {
    	
    	int [] resultArray = new int [length];
    	int resultArrayIndex=0;
    	int indexArray=0;
    	while(resultArrayIndex<length) { 
    		int count =0;
    		int number = array[indexArray]; 
    		while(array[indexArray]==number) {
    			count++; 
    			if(indexArray+1>=array.length) {
    			break;
    		    }else {
    		    	indexArray++; 
    		    }
    		}
    		resultArray[resultArrayIndex] = count; 
    		resultArrayIndex++; 
    	}
    	return resultArray;
    }
}
