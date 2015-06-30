package ua.org.oa.kozlobaeva.part1;

import java.io.*;

/**
 * Created by Alinka on 28.04.2015.
 */
public class Part1 {
    public static void main(String[] args) {

        String s;
        InputStreamReader in;
        BufferedReader br;
        StringBuilder sb = new StringBuilder();
        try {
            in = new InputStreamReader(new FileInputStream("test.txt"));
            br = new BufferedReader(in);
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
            String file = sb.toString();
            System.out.println(file);
            sb = new StringBuilder();
            for (String s1 : file.split(" ")) {
                if(s1.length() > 2){
                    s1 = s1.toUpperCase();
                }
                sb.append(s1 + " ");
            }
            System.out.println(sb);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
