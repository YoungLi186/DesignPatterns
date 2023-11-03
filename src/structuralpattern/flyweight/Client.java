package structuralpattern.flyweight;

import java.security.spec.RSAOtherPrimeInfo;

/**
 * @Date: 2023/11/3 - 11 - 03 - 16:05
 * @Description: structuralpattern.flyweight
 */
public class Client {
    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.getInstance();
        AbstractBox box1 = boxFactory.getBox("I");
        AbstractBox box2 = boxFactory.getBox("I");
        System.out.println("box1 和 box2 是否为同一个对象？"+(box1==box2));
    }
}
