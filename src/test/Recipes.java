package test;

import test.checkable.InputCheckable;
import test.checker.InputChecker;

import java.util.ArrayList;
import java.util.List;

public class Recipes {
    ArrayList<InputChecker<?>> list;

    public Recipes(List<InputChecker<?>> list) {
        this.list = (ArrayList<InputChecker<?>>) list;
    }

    Boolean matches(List<InputCheckable<?>> list) {
        boolean test = true;
        for (InputChecker<?> checker : this.list) {
            // java boolean optimisation doesn't call checker.check if test is already false.
            // process could be threaded should it ?
            test = test && checker.check(list);
        }
        return test;
    }
}
