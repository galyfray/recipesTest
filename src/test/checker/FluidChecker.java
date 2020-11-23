package test.checker;

import test.Fluid;
import test.checkable.FluidCheckable;
import test.checkable.InputCheckable;

import java.util.List;

public class FluidChecker extends InputChecker<Fluid> {
    @Override
    public Boolean check(List<? extends InputCheckable<?>> test) {
        for (InputCheckable<?> checkable : test) {
            if (checkable instanceof FluidCheckable) {
                System.out.println("Fluid checkable found !");
                return true;
            }
        }
        System.out.println("no Fluid checkable found !");
        return false;
    }
}
