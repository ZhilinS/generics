package ru.yandex.zhilin.level3;

class Paprica implements Spice {

    private final String name;

    Paprica(final String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }
}
