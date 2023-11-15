package _05_extends._14_抽象._01_抽象概念;

/**
 * ClassName:
 * Package: _05_extends._11_猫狗案例_继承版本
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/6 19:52
 * @Version 1.0
 */
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "正在吃骨头");
    }

    public void lookHome() {
        System.out.println(getAge() + "岁的" + getName() + "正在看家");
    }
}
