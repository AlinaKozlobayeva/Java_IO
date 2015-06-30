package ua.org.oa.kozlobaeva.part2;

import java.io.*;
import java.util.*;

/**
 * Created by Alinka on 28.04.2015.
 */
public class Part2 {
    public static void main(String[] args) {
        int num = 0;
        int size = 100;
        int i =0;
        List<Integer> nums = new ArrayList<Integer>();
        String s;
        InputStreamReader in;
        BufferedReader br;
//        StringBuilder sb = new StringBuilder();

        PrintWriter prw = null;
        try {
            prw = new PrintWriter(new FileWriter("randomdata.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Random generator = new Random();
        for ( i = 0; i < size; i++) {
            num = generator.nextInt(500);
            prw.write(num + "\n");
        }
        prw.close();

        try {
            in = new InputStreamReader(new FileInputStream("randomdata.txt"));
            br = new BufferedReader(in);
            while ((s = br.readLine()) != null) {
                nums.add(Integer.parseInt(s));
            }
            Collections.sort(nums);
            System.out.println(nums);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter prw1 = null;
        try {
            prw1 = new PrintWriter(new FileWriter("test2.txt"));
            for (Integer number : nums) {
                prw1.write(number.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            prw1.close();
        }

    }

}
