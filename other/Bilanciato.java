
public class Bilanciato {
    
    private int[] mioArray;

    public Bilanciato(int[] array) {
        mioArray = array;
    }

    public boolean testBilanciamento() {
        if(mioArray.length < 2) {
            return false;
        }
        return bilanciamento(0, mioArray.length -1, mioArray[0] + mioArray[mioArray.length-1]);
    }

    boolean bilanciamento(int idx1, int idx2, int sum){
        if(mioArray[idx1] + mioArray[idx2] != sum) {
            return false;
        }

        if(idx2 <= idx1) {
            return true;
        }

        return bilanciamento(idx1+1, idx2-1, sum);
    }


}
