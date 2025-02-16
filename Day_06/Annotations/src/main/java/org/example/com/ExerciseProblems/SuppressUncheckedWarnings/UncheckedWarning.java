package org.example.com.ExerciseProblems.SuppressUncheckedWarnings;
import java.util.ArrayList;

//UncheckedWarning class
public class UncheckedWarning {

    //hides unchecked type warnings
    @SuppressWarnings("unchecked")
    public static ArrayList createList() {
        //no generics used
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(42);
        list.add(true);
        return list;
    }

    public static void main(String[] args) {
        ArrayList list = createList();

        //retrieving values -explicit casting required
        String str = (String) list.get(0);
        int num = (int) list.get(1);
        boolean bool = (boolean) list.get(2);

        //printing values
        System.out.println("String: " + str);
        System.out.println("Integer: " + num);
        System.out.println("Boolean: " + bool);
    }
}

