package _04_AIP应用程序接口._03_Scanner;

/**
 * ClassName:
 * Package: _04_AIP应用程序接口._03_Scanner
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 23:00
 * @Version 1.0
 */
public class Student {
    private int id;
    private  String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String print() {
        return "学号:" + id + " 姓名:" + name + " 年龄:" + age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
