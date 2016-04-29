package Chapter21;

import java.io.*;
import java.util.TreeSet;

/**
 * Created by Pawel on 4/28/2016.
 */
public class Exercise22_2 {


    public Exercise22_2(String[] args) throws IOException {
        File f1 = new File(args[0]);
        TreeSet<String> hash = new TreeSet<>();
        FileReader reader = new FileReader(f1);
        BufferedReader bufferedReader = new BufferedReader(reader);
        while(bufferedReader.ready()){
            String temp = bufferedReader.readLine();
            while(temp.contains(" ")){
                hash.add(temp.substring(0,temp.indexOf(" ")));
                temp = temp.substring(temp.indexOf(" ") + 1, temp.length());
            }
        }
        System.out.println(hash);
    }
}
