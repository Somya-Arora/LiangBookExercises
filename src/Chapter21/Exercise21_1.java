package Chapter21;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Exercise21_1 {

    public static void main(String[] args){
        LinkedHashSet<String> list1 = new LinkedHashSet<>();
        LinkedHashSet<String> list2 = new LinkedHashSet<>();
        list1.add("George");
        list1.add("Jim");
        list1.add("John");
        list1.add("Blake");
        list1.add("Kevin");
        list1.add("Michael");
        list2.add("George");
        list2.add("Katie");
        list2.add("Kevin");
        list2.add("Michelle");
        list2.add("Ryan");
        System.out.println(list1);
        System.out.println(list2);

        HashSet<String> union = new HashSet<>();
        HashSet<String> difference = new HashSet<>();
        HashSet<String> intersection = new HashSet<>();

        union.addAll(list1);
        union.addAll(list2);

        for(String s:list1){
            if(list2.contains(s))
                intersection.add(s);
            if(!list2.contains(s))
                difference.add(s);
        }

        for(String s:list2){
            if(!list1.contains(s))
                difference.add(s);
        }

        System.out.println(intersection);
        System.out.println(difference);
        System.out.println(union + " Size of union:" + union.size());



    }

}
