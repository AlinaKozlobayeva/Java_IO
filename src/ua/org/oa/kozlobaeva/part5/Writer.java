package ua.org.oa.kozlobaeva.part5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by Alinka on 10.05.2015.
 */
public class Writer {
    private PrintWriter prw = null;

    public Writer(String fileName) {

        try {
            prw = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        prw.close();
    }


}
