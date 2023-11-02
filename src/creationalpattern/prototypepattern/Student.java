package creationalpattern.prototypepattern;

import java.io.Serializable;

/**
 * @Date: 2023/11/2 - 11 - 02 - 21:39
 * @Description: creationalpattern.prototypepattern
 */
class Student implements Serializable {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
