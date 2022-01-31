package com.card;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardMaskingTest {

    CardMasking underTest = new CardMasking();

    @Test
    public void cardEmptyOrNullTest() {
        String result = underTest.cardMasking("");
        assertEquals("Invalid Card- Null/Empty",result);
    }

    @Test
    public void cardSizeTest(){
        String result2 = underTest.cardMasking("0987654321123556465456");
        assertEquals("Invalid Card Size",result2);
    }

    @Test
    public void alphaNumericTest(){
        String result3 = underTest.cardMasking("098abc4321123456");
        assertEquals("Invalid CardNumber",result3);
    }

    @Test
    public void cardVerifyTest(){
        String result4 = underTest.cardMasking("0987654321123456");
        assertEquals("############3456",result4);
    }
}
