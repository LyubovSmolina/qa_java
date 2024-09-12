package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    //Добавлен объект Feline по принципу инъекции зависимостей - из кода удалена явная инициализация объекта (Feline feline = new Feline())
    private Feline feline;

    //Feline передан в конструктор Lion в качестве 2-го аргумента
    public Lion(String sex, Feline feline) throws Exception {
        this.feline  = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

       public int getKittens() {

        return feline.getKittens();
    }

    public boolean doesHaveMane() {

        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
