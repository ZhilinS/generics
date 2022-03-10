package ru.yandex.zhilin.level4;

final class Cinnamon implements Spice {

    private final String name;

    Cinnamon(final String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }
}
