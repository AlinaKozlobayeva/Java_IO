package ua.org.oa.kozlobaeva.part3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Alinka on 04.05.2015.
 */
public class Reader {

    private String s;
    private InputStreamReader in;
    private BufferedReader br;
    private StringBuilder sb = new StringBuilder();
    private String[] values;

    public Reader(String fileName) {
        try {
            in = new InputStreamReader(new FileInputStream(fileName));
            br = new BufferedReader(in);
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
            String s1 = sb.toString();
            values = s1.split(" ");
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void parseTo(String type) {
        for (int i = 0; i < values.length; i++) {
            try {
                switch (type.toLowerCase()) {
                    case "int":
                        Integer.parseInt(values[i]);
                        System.out.println(values[i]);
                        break;
                    case "double":
                        Double.parseDouble(values[i]);
                        System.out.println(values[i]);
                        break;
                    case "char":
                        if(values[i].length()<2){
                            System.out.println(values[i]);
                        }
                        break;
                    case "String":
                        if (values[i].length()> 2){
                            System.out.println(values[i]);
                        }else {
                            throw new Exception();
                        }
                        break;
                }
            } catch (Exception e) {

            }

        }
    }


}
