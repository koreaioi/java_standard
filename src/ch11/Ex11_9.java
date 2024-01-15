package ch11;

import java.util.*;
import java.util.Set;

public class Ex11_9 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
            System.out.println(objArr[i] + " = " + set.add(objArr[i]) );
//            set.add(objArr[i]);
        }

        System.out.println(set);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        /*
        * 순서와 중복을 허용하지 않음
        * */


    }
}
