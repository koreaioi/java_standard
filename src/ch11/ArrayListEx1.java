package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        /*
        * ArrayList는 기존의 Vector를 개선한 것, 자체 동기화처리가 된다.
        * 순서가 있고, 중복을 허용한다. (List 인터페이스를 구현하므로)
        * 데이터의 저장공간으로 배열을 사용한다. ("Array"List)
        * */
        ArrayList list1 = new ArrayList(10); //default size = 10

        list1.add(5); //컴파일러가 AutoBoxing 해준다. add(new Integer(5))
        list1.add(new Integer(4));
        list1.add(new Integer(3));
        list1.add(new Integer(2));
        list1.add(new Integer(1));

        ArrayList list2 = new ArrayList(list1.subList(1, 4)); //1 <= x < 4
        print(list1, list2);

        //Collection은 인터페이스, Collections는 유틸 클래스이다.
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        //모든 요소를 포함하고 있는지
        System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); //추가할 인덱스 지정, 뒤로 밀려서 비용발생
        System.out.println(list2);
        list2.set(3, "AA"); //3번째 인덱스 값을 수정
        System.out.println(list2);

        /*
        * indexOf("1") 과 indexOf(new Integer(1))은 String과 Integer 형의 차이
        * */

        /*
        * remove(int index)는 index를 찾아서 지우고
        * remove(Object o)는 ex) remove(new Integer(1))는 숫자 1을 지운다.
        * 또는 remove("1")은 String형 1을 찾아 지운다.
        * 즉, 삭제할 때는 AutoBoxing이 안된다.
        * */

        for (int i = list2.size() - 1; i >= 0; i--) {
            //뒤에서 부터 삭제해야 복사가 일어나지 X, 더 효율적
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        print(list1, list2);
    }

    public static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2 +"\n");

    }
}
