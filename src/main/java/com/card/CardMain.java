package com.card;

public class CardMain {
    public static void main(String[] args) {
        String cardNumber;

        cardNumber = "1234567890123456";
       // cardNumber = null;

        CardMasking obj = new CardMasking();
        obj.cardMasking(cardNumber);
    }
}
