# TreeSet
이진 탐색 트리(binary search tree)로 구현, 범위 탐색과 정렬에 유리하다.

이진 트리는 모든 노드가 최대 2개의 하위 노드를 가진다.

각 요소(Node)가 나무(tree)형태로 연결(LinkedList의 변형)

    class TreeNode{
        TreeNode left;  // 왼쪽 자식 노드
        Object element; // 저장할 객체
        TreeNode rigt;  // 오른쪽 자식 노드
    }

## 이진 탐색 트리 (Binary search Tree)
- 부모보다 작은 값은 왼쪽 큰 값은 오른쪽에 저장한다.
- 데이터가 많아질 수록 추가, 삭제에 시간이 더 걸림(비교 횟수 증가)

## TreeSet - 데이터 저장 과정 booleadn add(Object o)
루트부터 트리를 따라 내려가며 값을 비교, 작으면 왼쪽, 크면 오른쪽에 저장

## TreeSet - 주요 생성자와 메서드
    TreeSet(Collection c) // 주어진 컬렉션을 저장하는 TreeSet을 생성
    TreeSet(Comparator comp) // 주어진 정렬 기준으로 정렬하는 TreeSet을 생성한다.
    Object first() //가장 작은 값
    Object last() //가장 큰 값
    Object ceiling(Object o) // 지정된 객체과 같은 객체 or 큰 값 중 가장 가까운 값
    Object floor(Object o) // 지정된 객체과 같은 객체 or 작은 값 중 가장 가까운 값


