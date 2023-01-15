import D.NotificationI;
import D.TelegramNotification;
import L.Rectangle;
import L.Square;

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
        TreeSet<User> listTree = new TreeSet<>();
        listTree.add(new User("Alex3"));
        listTree.add(new User("Alex1"));
        listTree.add(new User("Alex2"));
        listTree.add(new User("Alex"));
        System.out.println(listTree);
        for (User user:listTree){
            System.out.print(user.name.hashCode() + " ");
        }
        System.out.println();
        System.out.println("Lesson 29. Studying SOLID!!!");
        Rectangle rectangle = new Rectangle();
        rectangle.setX(3);
        rectangle.setY(5);
        System.out.println(rectangle.perimetr());
        Square square = new Square();
        square.setX(3);
        System.out.println(square.perimetr());
        NotificationI notificationI = new TelegramNotification();
        notificationI.sendMessage("Hello world!");
    }
}