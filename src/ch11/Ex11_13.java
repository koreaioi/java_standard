package ch11;

import java.util.*;

public class Ex11_13 {
    public static void main(String[] args) {
//        Set set = new HashSet();
        Set set = new TreeSet(new TestComp());

/*        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
//            set.add(num);
            set.add(new Test());
        }*/
            set.add(new Test());
            set.add(new Test());
            set.add(new Test());
            set.add(new Test());

            /*
            * Test 클래스 안에 비교 기준이 있던지 또는
            * TreeSet생성자에 비교기준을 넘겨줘야한다. line8
            * */

        System.out.println(set);

    }
}

class Test{}

class TestComp implements Comparator {

    public int compare(Object o1, Object o2) {
        return -1;
    }

}


