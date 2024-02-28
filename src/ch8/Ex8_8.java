package ch8;

public class Ex8_8 {
    public static void main(String[] args) {
        throw new RuntimeException(); // RuntimeException을 고의로 발생시킨다.

        /*
        * Exception in thread "main" java.lang.RuntimeException
	        at ch8.Ex8_8.main(Ex8_8.java:5)
        * 컴파일은 잘 된다.
        * 하지만 런타임 동안 5번 라인에서 오류가 남.
        * 즉 unchecked예외는
        * 예외 처리가 필수가 아닌 선택
        * */
    }
}
