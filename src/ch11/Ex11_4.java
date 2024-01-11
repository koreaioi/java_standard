package ch11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
    /*
     * Queue는 인터페이스로서 이를 사용하기 위해서는
     * Queue를 구현한 인터페이스 LinkedList를 사용
     * */
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;
    //Queue에 ㅗ치대 5개까지만 저장되도록한다.

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.println(">>");
            try {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine().trim();

                if ("".equals(input)) continue;

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를" + MAX_SIZE + "개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    save(input);

                    //LinkedList의 내용을 보여준다.
                    LinkedList tmp = (LinkedList) q;

                  /* list의 사이즈는 가변이므로
                  처음 size값을 상수로 저장하고 for문을 돌려야한다.
                   final int SIZE = tmp.size();
                    for (int i = 0; i < SIZE; i++) {
                        System.out.println((i + 1) + "." + tmp.get(i));
                    }*/

                    ListIterator it = tmp.listIterator();
                    while (it.hasNext()) {
                        System.out.println(++i + "." + it.next());
                    }



                }else{
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("입력오류입니다.");
            } //try-catch 종료
        }//while 종료
    } //main 종료

    public static void save(String input) {
        //queue 에 저장한다.
        // if(input != null && !input.equals("")와 동치 null.equals를 하면 NPE가 발생하므로 "".equals()로 트릭사용
        if (!"".equals(input)) q.offer(input);

        //최대 크기를 넘으면 제일 처음 입력된(큐에 가장 오래있던)값을 삭제한다.
        if (q.size() > MAX_SIZE) q.remove();
    }//save 종료

}
