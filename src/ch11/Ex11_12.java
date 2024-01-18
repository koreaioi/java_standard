package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet(); //합집합
        HashSet setKyo = new HashSet(); //교집합
        HashSet setCha = new HashSet(); //차집합

        setA.add("1"); setA.add("2"); setA.add("3");
        setA.add("4"); setA.add("5");
        System.out.println("A = " + setA);

        setB.add("4"); setB.add("5"); setB.add("6");
        setB.add("7"); setB.add("8");
        System.out.println("B = " + setB);

        // 교집합
        Iterator it = setB.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if (setA.contains(o)){
                setKyo.add(o);
            }
        }

        //차집합 A - B, setB에 없는 A의 값을 차집합에 저장.
        it = setA.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if (!setB.contains(o)) {
                setCha.add(o);
            }
        }

        it = setB.iterator();
        while(it.hasNext()){
            setHab.add(it.next());
        }
        it = setA.iterator();
        while(it.hasNext()){
            setHab.add(it.next());
        }
 
        /*
        * setA.retainAll(setB) //교집합. 공통된 요소만 남기고 삭제
        * setA.addAll(setB)    //합집합. setB의 모든 요소를 추가(중복 제외)
        * setA.removeALl(setB) //차집합. setB와 공통 요소를 제거
        * */

        System.out.println("setKyo =" + setKyo);
        System.out.println("setCha =" + setCha);
        System.out.println("setHab =" + setHab);
    }
}
