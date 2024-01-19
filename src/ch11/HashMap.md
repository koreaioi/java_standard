# HashMap과 Hashtable
순서X, 중복(키X, 값O)

HashMap(동기화X)은 Hashtable(동기화O)의 신버젼

순서를 유지하려면, LinkedHashMap클래스를 사용


## HashMap의 키와 값
- 해싱기법으로 데이터를 저장해 데이터가 많아도 검색이 빠르다.
- Map 인터페이스를 구현. 데이터를 키와 값의 '쌍'으로 저장


    HashMap hm = new Hashmap();
    hm.put("myId", "1234");
    hm.put("asdf", "1111");
    hm.put("asdf", "1234");

위 경우는 (myId,1234) 와 (asdf,1234) 두쌍이 저장된다. (덮어쓰기 됨)

## 해싱(Hashing)
- 해시 함수를 이용해 저장 & 읽어오기
- 해시 함수로 해시 테이블에 데이터를 저장, 검색한다.
- 해시 테이블은 배열과 링크드 리스트가 조합된 형태

### 해시 테이블에 저장된 데이터를 가져오는 과정
1. 키로 해시 함수 호출해서 해시 코드를 얻는다.
2. 해시 코드(해시함수의 반환 값)에 대응하는 LinkedList를 배열에서 찾는다.
3. LinkedList에서 키와 일치하는 데이터를 찾는다.
* 해시 함수는 같은 키에 대해 항상 같은 해시코드를 반환해야 한다. 서로 다른 키 일지라도 같은 값의 해시 코드를 반환할 수도 있다.
