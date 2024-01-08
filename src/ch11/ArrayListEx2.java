package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10; //자르고자하는 글자의 개수 지정.
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        List list = new ArrayList(10 + length / LIMIT); //크기를 여유롭게 잡기

        for (int i = 0; i < length; i = i + LIMIT) {
            //i + LIMIT 문자수가 43개이므로 i가 40이고 10을 더하면 기존 문자열보다 높은 경우를 방지
            if (i + LIMIT < length) {
                list.add(source.substring(i, i + LIMIT)); //String 반환
            }else{
                list.add(source.substring(i)); //인덱스 i 부터 그 이후까지 반환
            }
        }
        for (int i = 0; i < list.size(); i++) {
            //list에는 String이 들어가 있음
            System.out.println(list.get(i));
        }

       /* for (Object o : list) {
            System.out.println(o.toString());
        }*/


    }
}
