package ch8;

public class Ex8_9 {

    // main -> method1 -> method2
    // method2에서 발생한 예외는 처리 안되고 method1로 넘어감 ..... main에서도 넘어간상태로 종료되어 JVM이 처리

    public static void main(String[] args) throws Exception{
        method1();
    }


    static void method1() throws Exception{
        method2();
    }

    static void method2() throws Exception{
        throw new Exception();
    }
}
