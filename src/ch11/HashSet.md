# HashSet - 순서X, 중복X
- Set 인터페이스를 구현한 대표적인 컬렉션 클래스
- 순서를 유지하려면, LinkedHashSet클래스를 사용하자

# TreeSet
- 범위 검색과 정렬에 유리한 컬렉션 클래스
- HashSet보다 데이터 추가, 삭제에 시간이 더 걸림

# HashSet
- HashSet은 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인
같은 객체가 없으면 저장, 있으면 저장하지 않는다.
- boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출 즉,equals()와 hashCode()가 오버라이딩 되어있어야한다.





