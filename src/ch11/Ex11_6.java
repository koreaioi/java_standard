package ch11;

import java.util.Arrays;

public class Ex11_6 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};

        System.out.println("arr = " + Arrays.toString(arr));;
        //System.out.println("arr = " + Arrays.toString(arr2D));; //안됨
        System.out.println("arr2D = " + Arrays.deepToString(arr2D));;

        int[] arr2 = Arrays.copyOf(arr, 5);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7); //나머지는 default값으로 채운다.
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4 ); // 2<= range < 4
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7); //copyOf(arr,7)

        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));
        System.out.println("arr5 = " + Arrays.toString(arr5));
        System.out.println("arr6 = " + Arrays.toString(arr6));

        int[] arr7 = new int[5]; //크기가 5인 int 배열
        Arrays.fill(arr7, 9); //9로 채우기
        System.out.println("arr7 = " + Arrays.toString(arr7));

        Arrays.setAll(arr7, (i) -> (int) (Math.random() * 5) + 1);
        System.out.println("arr7 = " + Arrays.toString(arr7));

        for (int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i); // 지리네
        }

        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        System.out.println(Arrays.equals(str2D, str2D2));
        System.out.println(Arrays.deepEquals(str2D, str2D2));

        char[] chArr = {'A', 'D', 'C', 'B', 'E'};
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
        System.out.println("= After sorting=");
        Arrays.sort(chArr);
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
    }
}
