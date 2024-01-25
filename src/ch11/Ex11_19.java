package ch11;
import java.util.*;

import static java.util.Collections.*;

public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);

        rotate(list, 2); //반시계 방향으로 두번 회전, 두 칸 오른쪽으로 이동
        System.out.println(list);

        swap(list, 0, 2);
        System.out.println(list);

        shuffle(list);
        System.out.println(list);

        sort(list, reverseOrder());
        System.out.println(list);

        sort(list);
        System.out.println(list);

        int idx = binarySearch(list, 3); // 3이 저장된 위치
        System.out.println("index of 3 = " + idx);

        System.out.println("max="+max(list));
        System.out.println("min="+min(list));

        fill(list, 9);
        System.out.println("list" + list);

        // list와 같은 크기의 새로운 list를 생성하고 2로 채운다, 단, 결과는 변경불가
        List newList = nCopies(list.size(), 2);
        System.out.println("newList = " + newList);;

        System.out.println(disjoint(list, newList)); //공통요소가 없으면 참

        copy(list, newList); //newList의 값을 list에 복사
        System.out.println("newList = " + newList);
        System.out.println("list = " + list);

        //list의 숫자 2를 1로 모두 교체
        replaceAll(list, 2, 1);
        System.out.println("list = " + list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);

        System.out.println("list2 = " + list2);


    }
}
