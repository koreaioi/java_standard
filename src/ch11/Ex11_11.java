package ch11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}
//equals와 hashCode를 오버라이딩 해야 set에 중복 적용이 안됨
class Person{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof  Person)) return false; //Object o가 Person이 아니면 당연히 같지 않으므로 false 리턴

        Person p = (Person) o; //형변환을 하지 않으면 Object라는 리모컨에는 name과 age가 없기에 이들을 사용할 수 없다.
        //나 자신(this)의 이름과 나이를 p와 비교
        return this.name.equals(p.name) && this.age == p.age;
    }

    @Override
    public int hashCode() {
        //int hash(Object... values);
        return Objects.hash(name, age);
    }
}
