package ch8;

public class Ex8_7 {
    public static void main(String[] args) {
        //throw new Exception(); //Exception을 고의로 발생시킨다.

        /*
        * java: unreported exception java.lang.Exception; must be caught or declared to be thrown
        * 오류 메시지 위는 checked예외 이므로 예외처리를 필수로 해야하는 예외이다.
        * 즉 예외를 처리하지 않으면 컴파일조자 되지 않음
        *
        * 이를 고치기 위해서는 throw된 예외를 잡아주는 catch문이 있어야한다.
        * */
    }
}
