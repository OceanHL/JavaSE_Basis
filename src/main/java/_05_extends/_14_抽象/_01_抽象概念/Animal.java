package _05_extends._14_抽象._01_抽象概念;

/**
 * ClassName:
 * Package: _05_extends._11_猫狗案例_继承版本
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/6 19:44
 * @Version 1.0
 */
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }


    // 需要子类进行重写的方法（子类们共同拥有方法，但各自执行过程不一样）
    public void eat() {
        System.out.println("吃东西");
    }

    // 不需要子类们进行重写的方法（子类们共同拥有方法，执行过程一样）
    public void sleep() {
        System.out.println("睡觉觉");
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
