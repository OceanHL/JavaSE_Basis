package _05_extends._14_抽象._04_猫狗案例_抽象类;

/**
 * ClassName:
 * Package: _05_extends._14_抽象._04_案例
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/8 21:35
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // 创建Cat对象
        final Cat tom = new Cat("Tom", 18);
        tom.eat();
        tom.catchMice();
        tom.sleep();

        System.out.println("------------------------------------");

        // 创建Dog对象
        final Dog jerry = new Dog("Jerry", 18);
        jerry.eat();
        jerry.lookHome();
        jerry.sleep();

    }
}
