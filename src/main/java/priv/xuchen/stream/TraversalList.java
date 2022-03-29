package priv.xuchen.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * java8 stream遍历List
 *
 * @version 1.0
 * @author: xuchen
 * @date: 2022/3/29 10:20
 */
public class TraversalList {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");
        
        items.forEach(val -> System.out.println(val));
    }
}
