package ru.yandex.zhilin.level2;

final class Box { // Чтобы работать с определенными специями, класс должен быть параметризированным

    private final ? spices; // Пусть это будет коллекция специй

    public Box() {
        this.spices = ??;
    }

    public void add(? spice) {
        this.spices.add(spice);
    }

    public void say() {
        System.out.println("This box contains:");
        // Вывести в консоль все специи в коробке
    }
}
