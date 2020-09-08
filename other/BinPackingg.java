import java.util.Arrays;

public class BinPackingg {
	
	public static void main(String [] args) {
		int [] a = {4,1,2,5,3,2,3,6,3};
		int s =6;
		System.out.println(ffd(a,s));
	}
	
	
	static int ffd(int [] array, int s) {
	int [] copiedArray = array;	//1>>copy of array
	sorting(copiedArray);
	int [] countingArray = new int [array.length]; 
	int [] rispostaFinale = arraySumOfEachGroup(countingArray,copiedArray,s); 
	int numberOfGroups = numberOfNotEmptyGroups(rispostaFinale);
	return numberOfGroups;
	}
	
	
	static void sorting(int [] array) {
		for(int i=0; i<array.length; i++) {
			int max = array[i];
			int index=i;
			for(int j=i+1; j<array.length-1; j++) {
				if(array[j]>max) {
					max=array[j];
					index = j;
				}
			}
			int temp = array[i];
			array[i] = max;
			array[index] = temp;
		}
	}
	
	
	static int [] arraySumOfEachGroup(int [] countingArray,int [] array, int s) { 
		int countingIndex=0;
		int arrayIndex=0;
		while(arrayIndex<array.length) {
			countingIndex=0;
			while(array[arrayIndex]+countingArray[countingIndex]>s) {
				countingIndex++;
			}
			countingArray[countingIndex]= countingArray[countingIndex] + array[arrayIndex];
		    arrayIndex++;
		}
		return countingArray;
	}
	
	
	static boolean ifMinoreUguale(int a, int b, int s) {
		return (a+b<=s);
	}
	
	
	static int numberOfNotEmptyGroups(int [] array) {
		int count =0;
		for(int i=0; i<array.length; i++){
			if(array[i]!=0) {
			count++;
			}
		}
		return count;
	}
}
