package ru.yandex.zhilin.level3;

class Cinnamon implements Spice {

    private final String name;

    Cinnamon(final String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }
}
