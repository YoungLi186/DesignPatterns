package creationalpattern.prototypepattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Date: 2023/11/2 - 11 - 02 - 21:33
 * @Description: creationalpattern.prototypepattern
 * 实现深拷贝，需要用到对象流
 */
public class Client2 {
    public static void main(String[] args) throws Exception{
        Citation c1 = new Citation();
        Student stu = new Student("张三", "西安");
        c1.setStudent(stu);
        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new
                FileOutputStream("E:\\b.txt"));
        //将c1对象写出到文件中
        oos.writeObject(c1);
        oos.close();

        //创建对象出入流对象
        ObjectInputStream ois = new ObjectInputStream(new
                FileInputStream("E:\\b.txt"));
        //读取对象
        Citation c2 = (Citation) ois.readObject();
        //获取c2奖状所属学生对象
        Student stu1 = c2.getStudent();
        stu1.setName("李四");
        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));
        c1.show();
        c2.show();
    }
}
