package com.sda.passwarder;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PasswordGeneratorTest {

    @Test
    public void givenLetterGenerator_WhenGeneratingPasswordWithLength_ThenPasswordIsGenerated() {


        LetterGenerator letterGenerator = new LetterGenerator();


        int len = 8;

        String password = letterGenerator.createPassword(len);

        Assertions.assertThat(password).isNotNull().isNotBlank();
        Assertions.assertThat(password.length()).isEqualTo(len);

    }
}

