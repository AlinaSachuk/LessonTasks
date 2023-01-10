import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        ListIterator iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        ArrayDeque<String> listQ = new ArrayDeque<>();
        listQ.add("one");
        listQ.add("two");
        listQ.add("three");
        System.out.println(listQ);
        System.out.println(listQ.pop());
        System.out.println(listQ);
        HashMap<String, String> map = new HashMap<>();
        map.put("0", "zero");
    }
}