package ch11;

import java.util.*;

public class Ex11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        // iterator는 일회용이라 다 쓰고나면 다시 얻어와야한다.
        it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        Collection c = new HashSet();
        // Collection c = new TreeSet();
        /*
        * 변수 타입을 Collection으로 설정해
        * HashSet과 TreeSet이 공통으로 가지고있는 메서드로 차후 코드들을 작성하면
        * new HashSet() <-> new TreeSet()부분만 고쳐도 실행이 잘 된다.
        * */
    }
}
