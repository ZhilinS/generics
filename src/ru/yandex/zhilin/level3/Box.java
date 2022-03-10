package ru.yandex.zhilin.level3;

import java.util.ArrayList;
import java.util.List;

class Box<T> {

    private final List<T> spices;

    Box() {
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
