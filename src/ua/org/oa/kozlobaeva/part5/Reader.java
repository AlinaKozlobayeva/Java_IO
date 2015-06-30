package ua.org.oa.kozlobaeva.part5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Alinka on 09.05.2015.
 */
public class Reader implements Iterable <String> {


    private ArrayList<String> file = new ArrayList<String>();
    private String s;
    private InputStreamReader in;
    private BufferedReader br;
    private StringBuilder sb = new StringBuilder();

    public Reader (String fileName) {
        try {
            in = new InputStreamReader(new FileInputStream(fileName));
            br = new BufferedReader(in);
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
            String s1 = sb.toString();
//            System.out.println(s1);
            sb = new StringBuilder();
            for (String ss : s1.split(";")) {
                file.add(ss);
            }
            System.out.println(file + "|size|" + file.size());

//            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Iterator<String> iterator() {
        Iterator<String> istr = file.iterator();
        return istr;
    }
}
