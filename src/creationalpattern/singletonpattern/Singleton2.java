package creationalpattern.singletonpattern;

/**
 * @Date: 2023/11/1 - 11 - 01 - 20:28
 * @Description: 单例模式之懒汉式：在调用方法时才创建对象
 */
public class Singleton2 {
    private String name;

    //构造器私有化
    private Singleton2() {
    }


    private static Singleton2 singleton2 ;

    //对外提供静态方法获取该对象
    public static Singleton2 getInstance(){
        if(singleton2==null){
            return  new Singleton2();
        }
        return  singleton2;
    }
}
