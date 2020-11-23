package test.checker;

import test.Item;
import test.checkable.InputCheckable;
import test.checkable.ItemCheckable;

import java.util.List;

public class ItemChecker extends InputChecker<Item> {


    @Override
    public Boolean check(List<? extends InputCheckable<?>> test) {
        for (InputCheckable<?> checkable : test) {
            if (checkable instanceof ItemCheckable) {
                System.out.println("item checkable found !");
                return true;
            }
        }
        System.out.println("no item checkable found !");
        return false;
    }
}
