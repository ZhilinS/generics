package ru.yandex.zhilin.level3;

public class Main {

    public static void main(String[] args) {
        final Box<Paprica> papricas = new Box();
        papricas.add(new Paprica("Красная паприка"));
        papricas.add(new Paprica("Розовая паприка"));
        papricas.say();
        System.out.println("==============");
        final Box<Cinnamon> cinnamons = new Box();
        cinnamons.add(new Cinnamon("Цейлонская корица"));
        cinnamons.add(new Cinnamon("Китайская орица"));
        cinnamons.say();

        // Но тут мы можем создать и коробку кошек, но нам надо чтобы было возможно только
        // работать со специями.
        final Box<Cat> cats = new Box<>();
        cats.add(new Cat());
    }

    private static class Cat {}
}
