package test;

import test.checkable.FluidCheckable;
import test.checkable.InputCheckable;

import java.util.ArrayList;
import java.util.List;

public class Machine {
    List<InputCheckable<?>> getCheckable() {
        ArrayList<InputCheckable<?>> list = new ArrayList<>();
        //list.add(new ItemCheckable());
        list.add(new FluidCheckable());
        return list;
    }
}
