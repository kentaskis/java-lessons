package _18102022;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Lists {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(rand.nextInt(200));
        }
        System.out.println("ArrayList:" + arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(rand.nextInt(200));
        }
        System.out.println("LinkedList:" + linkedList);


    }
}
