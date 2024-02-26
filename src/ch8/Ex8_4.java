package ch8;

public class Ex8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            //System.out.println(args[0]); // ArrayIndexOutOfBoundsException
            System.out.println(4); // (0/0)에서 예외가 처리되어 이 문장은 진행되지 않음
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e){
            System.out.println("Exception");
            //모든 예외의 최고 조상, 모든 예외 처리 가능
        }
        System.out.println(6);
    }
}
