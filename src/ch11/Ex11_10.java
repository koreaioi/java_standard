package ch11;

import java.util.*;

public class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            //set.add(new Integer(num));
            set.add(num);
        }

        System.out.println(set); //정렬 안된 채로 출력됨

        //Set은 정렬 불가하기에 List에 정렬하고

        List list = new LinkedList(set); // 1.Set의 모든 요소를 List에 저장
        Collections.sort(list); // 2. list를 정렬
        System.out.println(list); // 3. list를 출력


    }
}
