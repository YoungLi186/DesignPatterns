package structuralpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date: 2023/11/3 - 11 - 03 - 16:08
 * @Description: structuralpattern.flyweight
 */
public class BoxFactory {
    private Map<String,AbstractBox> map;//使用map来存放对象，实现共享

    private BoxFactory() {
        map =new HashMap<>();
        IBox iBox = new IBox();
        LBox lBox = new LBox();
        OBox oBox = new OBox();
        map.put("I",iBox);
        map.put("L",lBox);
        map.put("O",oBox);
    }

    //使用final修饰,不能以其他方式获得工厂实例
    public static final BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }
    private static class SingletonHolder {
        //单例，只能有一个工厂类
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public AbstractBox getBox(String key) {
        return map.get(key);
    }


}
