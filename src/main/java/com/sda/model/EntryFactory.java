package com.sda.model;

import com.sda.passwarder.LetterGenerator;

public class EntryFactory {

    public static PasswordEntry createEntry(String website, String login, int len) {

        LetterGenerator creator = new LetterGenerator();

        String password = creator.createPassword(len);

        return new PasswordEntry(website, login, password);
    }
}
