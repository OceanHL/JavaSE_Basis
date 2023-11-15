package _05_extends._14_抽象._04_猫狗案例_抽象类;

/**
 * ClassName:
 * Package: _05_extends._14_抽象._04_案例
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/8 21:32
 * @Version 1.0
 */
public class Cat  extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println(getName() + "吃鱼");
    }

    // 猫特有的方法：抓老鼠
    public void catchMice() {
        System.out.println(getAge() + "岁的" + getName() + "猫正在抓老鼠……");
    }
}
