package ch6;

public class Ex6_2 {
    public static void main(String[] args) {

        //객체마다 별도의 저장 공간을 가진다.
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " +  t1.channel +"입니다");
        System.out.println("t2의 channel값은 " +  t2.channel +"입니다");

        t1.channel = 7; // t1의 channel 값을 7로 변경
        System.out.println("t1의 channel값을 7로 변경했습니다.");

        System.out.println("t1의 channel값은 " +  t1.channel +"입니다");
        System.out.println("t2의 channel값은 " +  t2.channel +"입니다");

        t2 = t1; //참조변수 t1의 값을 t2에 저장.
        System.out.println("t2의 channel값은 " +  t2.channel +"입니다");
        System.out.println("t1의 channel값은 " +  t1.channel +"입니다");
    }
}
