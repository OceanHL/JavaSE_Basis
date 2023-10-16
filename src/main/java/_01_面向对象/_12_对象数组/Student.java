package _01_面向对象._12_对象数组;

/**
 * ClassName: Student
 * Package: _01_面向对象._09_构造器
 * Description:
 *
 * @Author Oceanj_hl
 * @Create 2023/10/10 20:29
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String print() {
        return "姓名：" + name + "，年龄：" + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

