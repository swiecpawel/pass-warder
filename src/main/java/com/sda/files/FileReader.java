package com.sda.files;

import com.sda.model.PasswordEntry;

import java.io.IOException;
import java.util.List;

public interface FileReader {
    List<String> read(String path) throws IOException;
    List<PasswordEntry> getPasswordEntry(String path) throws IOException;


}
