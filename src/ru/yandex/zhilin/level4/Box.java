package ru.yandex.zhilin.level4;

import java.util.ArrayList;
import java.util.List;

final class Box<T extends Spice> {

    private final List<T> spices;

    public Box() {
        this.spices = new ArrayList<>();
    }

    public void add(T spice) {
        this.spices.add(spice);
    }

    public void say() {
        System.out.println("This box contains:");
        for (Spice spice:this.spices) {
            System.out.println(spice.name());
        }
    }
}
