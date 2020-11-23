package test;

import test.checker.InputChecker;
import test.checker.ItemChecker;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        ArrayList<InputChecker<?>> list = new ArrayList<>();
        list.add(new ItemChecker());
        list.add(new ItemChecker());
        Recipes r = new Recipes(list);
        Machine m = new Machine();
        r.matches(m.getCheckable());
    }
}
