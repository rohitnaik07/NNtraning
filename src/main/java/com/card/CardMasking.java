package com.card;
import org.apache.log4j.Logger;

public class CardMasking {

    static Logger log = Logger.getLogger(CardMasking.class.getClass());

    public String cardMasking(String cardNumber){

        StringBuilder maskedCard = new StringBuilder();

        if(cardNumber==null || cardNumber.equals("")){
            log.info("Entered card number is null or empty");
            return "Invalid Card";
        }else if(isInvalidCardSize(cardNumber)) {
            return "Invalid Card Size";
        } else if(isCardContainsAlphanumeric(cardNumber)) {
            return "Invalid CardNumber : contains alphabets or symbols";
        }else{
            int maskLength = 11;
            char mask = '#';
            for (int pos = 0; pos < cardNumber.length(); pos++) {
                if (pos <= maskLength) {
                    maskedCard.append(mask);
                }
                else {
                    maskedCard.append(cardNumber.charAt(pos));
                }
            }
        }
        log.info("Masked CardNumber is :"+maskedCard);
        return maskedCard.toString();
    }

    private boolean isInvalidCardSize(String cardNumber) {
        if(cardNumber.length()==16){
            return false;
        }else{
            log.info("Invalid CardNumber Size");
            return true;
        }
    }

    private boolean isCardContainsAlphanumeric(String cardNumber){
        //int lengthOfString = cardNumber.length();
        boolean error = false;

        for (int pos = 0; pos < cardNumber.length(); pos++) {

            char check = cardNumber.charAt(pos);

            if ((check >= 'a' && check <= 'z') || (check >= 'A' && check <= 'Z') || (check >=(char)32 && check <=(char)47) || (check >=(char)58 && check <=(char)64)) {
                log.info("Entered cardNumber contains Alphabets and Symbols : Invalid Card");
                // System.out.println("Entered cardNumber contains Alphabets and Symbols : Invalid Card");
                error = true;
                break;
            }
        }
        if(error){
            return true;
        }else{
            return false;
        }
    }
}
