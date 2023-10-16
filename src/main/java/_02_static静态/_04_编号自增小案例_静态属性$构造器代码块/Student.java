package _02_static静态._04_编号自增小案例_静态属性$构造器代码块;

/**
 * ClassName:
 * Package: _02_static静态._04_编号自增小案例
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 20:29
 * @Version 1.0
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private static int count = 220704001;

    // 初始化代码块
    {
        this.id = count++;
    }
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String print() {
        return "id:" + id + " name:" + name + " age:" + age;
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
