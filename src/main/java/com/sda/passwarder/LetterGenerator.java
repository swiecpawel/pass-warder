package com.sda.passwarder;

import java.util.Random;

public class LetterGenerator {

    Random rand = new Random();



    char upperCase='a';

    char lowerCase='a';

    char number = 'a';

    int kind = 0;


    String password = "";

    public StringBuilder sb = new StringBuilder(password);

    public String createPassword(int signs) {


        for (int i = 0; i < signs; i++) {

            upperCase = (char) (rand.nextInt(26) + 65);
            lowerCase = (char) (rand.nextInt(26) + 97);
            number = (char) (rand.nextInt(10) + 48);

            kind = rand.nextInt(3);

            if (kind == 0){
                sb.append(upperCase);
            }
            if(kind == 1) {
                sb.append(lowerCase);
            }
            if(kind == 2) {
                sb.append(number);
            }
        }


        return sb.toString();
    }


}





