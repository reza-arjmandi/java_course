
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCases {
    
    @Test
    public void testBilanciatoCase1() {

        int[] array = {-4, -4};
        Bilanciato bilanciato = new Bilanciato(array);

       assertTrue(bilanciato.testBilanciamento());
    }

    @Test
    public void testBilanciatoCase2() {

        int[] array = {12, -3, 22, 7};
        Bilanciato bilanciato = new Bilanciato(array);

       assertTrue(bilanciato.testBilanciamento());
    }

    @Test
    public void testBilanciatoCase3() {

        int[] array = {-3, 4, 100, -13, 9, -104, -8, -1};
        Bilanciato bilanciato = new Bilanciato(array);

       assertTrue(bilanciato.testBilanciamento());
    }

    @Test
    public void testBilanciatoCase4() {

        int[] array = {24};
        Bilanciato bilanciato = new Bilanciato(array);

       assertFalse(bilanciato.testBilanciamento());
    }

    @Test
    public void testBilanciatoCase5() {

        int[] array = {24,1,24};
        Bilanciato bilanciato = new Bilanciato(array);

       assertFalse(bilanciato.testBilanciamento());
    }

    @Test
    public void testBilanciatoCase6() {

        int[] array = {0,2,2,0};
        Bilanciato bilanciato = new Bilanciato(array);

       assertFalse(bilanciato.testBilanciamento());
    }

    @Test
    public void testBilanciatoCase7() {

        int[] array = {};
        Bilanciato bilanciato = new Bilanciato(array);

       assertFalse(bilanciato.testBilanciamento());
    }
}
