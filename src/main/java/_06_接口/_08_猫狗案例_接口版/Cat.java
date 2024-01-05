package _06_接口._08_猫狗案例_接口版;

/**
 * ClassName:
 * Package: _06_接口._08_猫狗案例_接口版
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/15 21:48
 * @Version 1.0
 */
public class Cat extends  Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse() {
        System.out.println(getAge() + "岁的" + getName() + "猫去抓老鼠");
    }
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
