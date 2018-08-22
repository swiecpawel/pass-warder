package com.sda;
import com.sda.files.BufferedFileReader;
import com.sda.files.PasswordEntryFileWriter;
import com.sda.model.EntryFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedFileReader reader = new BufferedFileReader();


        List<String> list = new ArrayList<>();

        PasswordEntryFileWriter pasWriter = new PasswordEntryFileWriter();


        Scanner scanner = new Scanner(System.in);
        String password;
        int x;


        do {
            System.out.println("_MENU________");
            System.out.println("jezeli chcesz wygenerowac haslo do serwisu wpisz 1 ");
            System.out.println("jezeli chcesz sprawdzic liste hasel woisz 2");
            System.out.println("jezeli chcesz wyjsc wpisz 0");

            x = scanner.nextInt();
            scanner.nextLine();
            if (x == 1) {
                System.out.println("podaj login");

                String login = scanner.nextLine();
                System.out.println("podaj serwis");
                String serwis = scanner.nextLine();
                System.out.println("podaj dlugosc hasla");
                int leng = scanner.nextInt();
                scanner.nextLine();
                password = EntryFactory.createEntry(serwis, login, leng).toString();
                System.out.println(password);

                System.out.println("czy zapisac haslo do " + serwis);
                System.out.println("tak - 1 \n nie - 2 ");

                x = scanner.nextInt();
                scanner.nextLine();
                if (x == 1) {
                    File file = getFile("password.txt");
                    FileWriter save = new FileWriter(file, true);
                    save.write(password + "\n");
                    save.close();
                } else {
                    System.out.println("nie zapisano");
                }
            }

            if (x == 2) {
                list = reader.read("password.txt");
                for (int i = 0; i < list.size(); i++) {
                    String s = list.get(i);
                    System.out.println(s);
                }

            }


        } while (x != 0);

    }

    private static String PATH = "C:\\PasswordWarder\\storage";

    static File getFile(String path) {
        if (path == null) {
            throw new IllegalArgumentException("May not be null");
        }
        path = PATH + "\\" + path;

        return Paths.get(path).toFile();
    }
}
