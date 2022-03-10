package ru.yandex.zhilin.level2;

class Main {

    public static void main(String[] args) {
        final Box papricas = new Box();
        papricas.add(new Paprica("Красная паприка"));
        papricas.add(new Paprica("Розовая паприка"));
        papricas.say();
    }
}
