package _02_static静态._02_静态变量;

/**
 * ClassName:
 * Package: _02_static静态._02_静态变量
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 19:42
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;
    static String classroom;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String classroom) {
        this.name = name;
        this.age = age;
        this.classroom = classroom;
    }

    public String print() {
        return name + " " + age + " " + classroom;
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

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
