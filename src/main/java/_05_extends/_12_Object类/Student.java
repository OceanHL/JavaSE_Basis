package _05_extends._12_Object类;

/**
 * ClassName:
 * Package: _05_extends._12_Object类
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/6 20:43
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

    @Override
    public String toString() {
        return "HelleWorld!";
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
