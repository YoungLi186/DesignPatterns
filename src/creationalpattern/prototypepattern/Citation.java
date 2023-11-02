package creationalpattern.prototypepattern;

import java.io.Serializable;

/**
 * @Date: 2023/11/2 - 11 - 02 - 21:40
 * @Description: creationalpattern.prototypepattern
 */ //奖状类
class Citation implements Cloneable , Serializable {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show() {
        System.out.println(student.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

}
