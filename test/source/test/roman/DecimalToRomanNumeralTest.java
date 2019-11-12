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
    void oneisI(){
        check(1, "I");
    }

    @Test
    void twoisII(){
        check(2, "II");
    }

    @Test
    void threeisIII(){ check(3, "III");}

    @Test
    void fourisIV(){check(4, "IV");}

    @Test
    void sevenidVII(){check(7, "VII");}

    @Test
    void fourteenisXIV(){check(14, "XIV");}

    @Test
    void twentyfourisXXIV(){check(24, "XXIV");}

    @Test
    void eightyfourisLXXXIV(){check(84, "LXXXIV");}

    @Test
    void ninetynineisXCVII(){check(99, "XCIX");}

    @Test
    void twohundredtwentyfourisXXIV(){check(224, "CCXXIV");}

    @Test
    void eighthundredeightyfourisLXXXIV(){check(884, "DCCCLXXXIV");}

    @Test
    void ninehundredninetynineisXCVII(){check(999, "CMXCIX");}
}