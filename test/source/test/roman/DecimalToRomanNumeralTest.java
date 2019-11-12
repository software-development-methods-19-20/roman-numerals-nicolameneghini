package test.roman;

import dssc.roman.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *  10 -> "X"
 *  0 -> ""
 *  1 -> "I"
 *  5 -> "V"
 *  50 -> "L"
 *
 *  Qual è il primo test che scriviamo? Quello dello zero
 */
public class DecimalToRomanNumeralTest {

    @Test
    void zeroIsEmptyString() {
        check(0, "");
    }

    private void check(int i, String s) {
        RomanNumeral romanNumeral = new RomanNumeral(i);
        assertEquals(s, romanNumeral.toString());
    }


    @Test
    void twoisII(){
        check(2, "II");
    }


    @Test
    void oneisI(){
        check(1, "I");
    }

    @Test
    void threeisIII(){ check(3, "III");}
}