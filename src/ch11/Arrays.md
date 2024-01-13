# Arrays
- 배열을 다루기 편리한 메서드 제공

### 1. 배열의 출력 - toString()

### 2. 배열의 복사 - copyOf(), copyOfRange()

    int[] arr = {0, 1, 2, 3, 4};
    int[] arr2 = Arrays.copyOf(arr, arr.length); //새로운 배열
    //Arrays.copyOf(복사할 배열, 0부터 어디까지)
    //Arrays.copyOfRange(복사할 배열, a, b) a<= range < b


### 3. 배열 채우기 - fill(), setAll()
    int[] arr = new int[5]; 
    Arrays.fill(arr, 9);
    Arrays.setAll(arr, (i) -> (int) (Math.random() * 5) + 1); //arr은 랜덤으로 채워짐



### 4. 배열의 정렬, 검색 - sort(), binarySearch()
int[] arr= {3,2,1,0,1,4};
int idx = Arrays.binarySearch(arr, 2); //idx = 5 <- 잘못된 결과, 정렬을 해줘야함

    Arrays,sort(arr);
    System.out.println(Arrays.toString(arr));
    int idx = Arrays.binarySearch(arr, 2) //idx = 2 <- 올바른 결과

### 5. 다차원 배열의 출력 - deepToString() 2차원 이상
    int[][] arr2D = {{11,12}.{21,22}};
    System.out.println(Arrays.deepToString(arr2D);

### 6. 다차원 배열의 비교 - deepEquals()
    String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};  //false
    String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}}; //true

### 7. 배열을 List로 변환 - asList(Object o)
    List list = Arrays.asList(new Integre[]{1,2,3,4,5}); //list = [1,2,3,4,5]
    List list = Arrays.asList(1,2,3,4,5); //list = [1,2,3,4,5]
    list.add(6) //UnsupportedOperationException
    /* asList()가 반환한 List는 읽기 전용이라서 추가, 삭제가 불가능하다.
     * 만약 수정하고 싶다면 다음과 같이 하면 된다.
     */
    List list = new ArrayList(Arrays.asList(1,2,3,4,5));

### 8 람다와 스트림 (14장) 관련 -parallelXXX(), spliterator(), stream()