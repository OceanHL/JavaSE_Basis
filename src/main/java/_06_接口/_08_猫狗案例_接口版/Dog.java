package _06_接口._08_猫狗案例_接口版;

/**
 * ClassName:
 * Package: _06_接口._08_猫狗案例_接口版
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/15 21:51
 * @Version 1.0
 */
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookHome() {
        System.out.println(getAge() + "岁的" + getName() + "正在看家");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
