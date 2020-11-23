package test.checker;

import test.checkable.InputCheckable;

import java.util.List;

public abstract class InputChecker<T> {

    public abstract Boolean check(List<? extends InputCheckable<?>> test);

}
