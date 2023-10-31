package behaviorpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

// 主题接口
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// 具体主题对象：猫
class Cat implements Subject {
    private List<Observer> observers;

    public Cat() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void makeSound() {
        System.out.println("猫大叫一声");
        notifyObservers();
    }
}

// 观察者接口
interface Observer {
    void update();
}

// 观察者对象：老鼠
class Mouse implements Observer {
    @Override
    public void update() {
        System.out.println("老鼠开始逃跑");
    }
}

// 观察者对象：主人
class Master implements Observer {
    @Override
    public void update() {
        System.out.println("主人被惊醒");
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Mouse mouse = new Mouse();
        Master master = new Master();

        cat.addObserver(mouse);
        cat.addObserver(master);

        cat.makeSound();
    }
}
