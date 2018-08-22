package com.sda.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedFileReader extends AbstractFileReader {



    @Override
   public List<String> read(String path) throws IOException {
        File file = getFile(path);

        List<String> list = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        String textLine = bufferedReader.readLine();
        do {
            list.add(textLine);
            textLine = bufferedReader.readLine();


        } while (textLine != null);

        bufferedReader.close();


        return list ;
    }


}





