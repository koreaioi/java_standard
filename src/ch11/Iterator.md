# Iterator, ListIterator, Enumeration
* Iterator == Enumeration

Iterator는 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화 한 것.

컬렉션에서 iterator()를 호출해서 iterator를 구현한 객체를 얻어서 사용한다.

### hasNext() - 읽어올 요소가 남아있는지 확인
### next() - 다음 요소를 읽어온다.

List 컬렉션의 get를 사용해 읽어오는 코드를 작성할 때, Set컬렉션으로 변경하면 다시 고쳐야한다.
하지만 iterator를 사용하면 고치지 않아도 된다.

### Map에는 iterator()가 없다.
keySet(), entrySet(), values()를 호출해야한다.

```java
Map map = new HashMap();
Iterator it = map.entrySet().iterator();

/*      위와 같음
        Set eSet = map.entrySet();
        Iterator it = eSet.iterator();
 */
```