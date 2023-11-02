package creationalpattern.prototypepattern;

/**
 * @Date: 2023/11/2 - 11 - 02 - 21:21
 * @Description: creationalpattern.prototypepattern
 * Java中的Object类中提供了 clone() 方法来实现浅克隆
 */
public class Client1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        Student stu = new Student("张三", "西安");
        c1.setStudent(stu);
        //复制奖状
        Citation c2 = c1.clone();
        //获取c2奖状所属学生对象
        Student stu1 = c2.getStudent();
        stu1.setName("李四");
        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));
        c1.show();
        c2.show();
    }
}







