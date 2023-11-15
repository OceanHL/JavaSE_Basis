package _05_extends._14_抽象._04_猫狗案例_抽象类;

/**
 * ClassName:
 * Package: _05_extends._14_抽象._04_案例
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/8 21:33
 * @Version 1.0
 */
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println(getName() + "正在吃骨头！");
    }


    // 狗的特有方法：看家
    public void lookHome() {
        System.out.println(getAge() + "岁的" + getName() + "狗，正在看家！");
    }
}
