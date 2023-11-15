package _05_extends._01_继承的格式;

/**
 * ClassName:
 * Package: _05_extends._01_继承的格式
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/16 22:25
 * @Version 1.0
 */
public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    // 吃东西
    public void eat() {
        System.out.println("吃东西");
    }

    // 睡觉
    public void sleep() {
        System.out.println("睡觉");
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
