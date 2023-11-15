package _05_extends._11_猫狗案例_继承版本;

/**
 * ClassName:
 * Package: _05_extends._11_猫狗案例_继承版本
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/6 19:43
 * @Version 1.0
 *
 * 猫狗案例（继承版本）
 */
public class Main {
    public static void main(String[] args) {
        // 创建Cat对象
        final Cat tom = new Cat("Tom", 2);
        tom.catchMouse();
        tom.eat();
        tom.sleep();

        System.out.println("===========");

        // 创建Dog对象
        final Dog jerry = new Dog("Jerry", 3);
        jerry.lookHome();
        jerry.eat();
        jerry.sleep();
    }
}
