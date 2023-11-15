package _05_extends._14_抽象._01_抽象概念;

/**
 * ClassName:
 * Package: _05_extends._11_猫狗案例_继承版本
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/6 19:48
 * @Version 1.0
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    //重写父类的eat()
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "在吃猫粮");
    }

    // 猫独有方法catchMouse()
    public void catchMouse() {
        System.out.println(getAge() + "岁的" + getName() + "在抓老鼠");
    }
}
