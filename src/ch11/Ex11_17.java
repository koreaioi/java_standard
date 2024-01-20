package ch11;
import java.util.*;

public class Ex11_17 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", new Integer(90));
        map.put("김자바", new Integer(100));
        map.put("이자바", new Integer(100));
        map.put("강자바", new Integer(80));
        map.put("안자바", new Integer(90));


        //key와 value가 한쌍으로 묶인게 entry이고 이를 set으로 저장
        //Entry는 Map안에 있는 인터페이스이다.
        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름: " + e.getKey() + ", 점수: " + e.getValue());
        }

        //이름만 보기 위해 key의 집합(set)만 가져옴
        set = map.keySet();
        System.out.println("참가자 명단: " +set);

        //value만 사용하므로 values 사용
        Collection values = map.values();
        it = values.iterator();
        int total =0;

        while (it.hasNext()) total += (int)it.next();

        System.out.println("총점: " + total);
        System.out.println("평균: " + (float) total / set.size());
        System.out.println("최고점수: " + Collections.max(values));
        System.out.println("최저점수: " + Collections.min(values));
        //컬렉션들 중에서 가장 큰 값, 작은 값 (Comparable을 구현한 클래스 객체)
    }
}
