package _01_面向对象._15_this的$第2种使用;

/**
 * ClassName:
 * Package: _01_面向对象._15_this的$第2种使用
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/10 21:59
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        // this.name = name;
        this(name, 0);
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
