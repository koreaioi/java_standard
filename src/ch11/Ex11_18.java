package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_18 {
    public static void main(String[] args) {
        String[] data = {"A", "K", "A", "K", "K", "K", "K", "K", "D", "D", "Z", "A"};
        HashMap<String, Integer> map = new HashMap();

        for (int i = 0; i < data.length; i++) {
            String tmp = data[i];
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }

/*      위와 같음
        for (int i = 0; i < data.length; i++) {
            String tmp = data[i];
            if (map.containsKey(tmp)) {
                int value = map.get(tmp);
                map.put(tmp, value + 1);
            }else{
                map.put(tmp, 1);
            }
        }
*/

        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int value = (int) entry.getValue();
            System.out.println(entry.getKey() + " : "
                    + printBar('#', value) + " " + value);
        }
    }

    public static String printBar(char c, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) answer += c;
        return answer;
    }
}
