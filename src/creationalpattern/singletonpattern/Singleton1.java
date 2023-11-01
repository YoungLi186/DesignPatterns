package creationalpattern.singletonpattern;

/**
 * @Date: 2023/11/1 - 11 - 01 - 20:28
 * @Description: 单例模式之饿汉式：在类加载时就创建对象
 */
public class Singleton1 {
    private String name;

    //构造器私有化
    private  Singleton1() {
    }

    private static Singleton1 singleton1 = new Singleton1();

    public Singleton1 getInstance(){
        return  singleton1;
    }


}
