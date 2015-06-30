package ua.org.oa.kozlobaeva.part5;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Alinka on 10.05.2015.
 */
public class Filter {

    private  List<String> output = new ArrayList<>();

    public Filter() {
    }

    public void filter(Reader readerMails, Reader readerGroups, String fileToWrite){
        Iterator<String> iterator = readerMails.iterator();
        Iterator<String> iter = readerGroups.iterator();
        while(iterator.hasNext()){
            while (iter.hasNext()){
                output.add(iterator.next() + " | " + iter.next());
            }
        }
            PrintWriter prw = null;
            try {
                prw = new PrintWriter(new FileWriter(fileToWrite));
                for (String s : output) {
                    if(!s.startsWith("#")) {
                        prw.write(s + "\n");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                prw.close();
            }

    }
}
