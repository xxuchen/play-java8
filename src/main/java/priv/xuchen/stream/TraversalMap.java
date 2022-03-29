package priv.xuchen.stream;

import java.util.HashMap;
import java.util.Map;

/**
 * java8 stream遍历Map
 *
 * @version 1.0
 * @author: xuchen
 * @date: 2022/3/29 10:13
 */
public class TraversalMap {

    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        
        items.forEach((k, v) -> System.out.println(k + "-->" + v));
    }
}
