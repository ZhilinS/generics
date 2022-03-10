package ru.yandex.zhilin.level4;

class Main {

    public static void main(String[] args) {
        final Box<Paprica> papricas = new Box<>();
        papricas.add(new Paprica("Розовая паприка"));
        papricas.add(new Paprica("Красная паприка"));
        papricas.say();

        System.out.println("===============");
        final Box<Cinnamon> cinnamons = new Box<>();
        cinnamons.add(new Cinnamon("Цейлонская корица"));
        cinnamons.add(new Cinnamon("Китайская корица"));
        cinnamons.say();
    }
}
