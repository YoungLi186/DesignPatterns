package structuralpattern.flyweight;

/**
 * @Date: 2023/11/3 - 11 - 03 - 16:05
 * @Description: structuralpattern.flyweight
 */
public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color){
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
