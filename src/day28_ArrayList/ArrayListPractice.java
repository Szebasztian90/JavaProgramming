package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) { // i -> is the index number
            list.set (i, list.get(i) * 2); // list.get(i) is the element
        }

        System.out.println(list);




    }
}
/*
{1,2,3,4,5,6}
multiply
{2,4,6,8,10,12}
 */