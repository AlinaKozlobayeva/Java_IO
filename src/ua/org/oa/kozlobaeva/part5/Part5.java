package ua.org.oa.kozlobaeva.part5;

import java.util.Iterator;

/**
 * Created by Alinka on 09.05.2015.
 */
public class Part5 {

    public static void main(String[] args){
        Reader reader = new Reader("mails");
        Iterator<String> iterator = reader.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Reader reader2 = new Reader("groups.txt");
        for (String ss : reader) {
            System.out.println(ss);
        }

        Filter f = new Filter();
        f.filter(reader, reader2, "users.txt");






    }

}
