package _06_接口._08_猫狗案例_接口版;

/**
 * ClassName:
 * Package: _06_接口._08_猫狗案例_接口版
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/15 21:44
 * @Version 1.0
 *
 * 猫狗案例（接口版）
 */
public class Main {
    public static void main(String[] args) {
        // 创建猫
        final Cat tom = new Cat("Tom", 2);
        tom.catchMouse();
        tom.eat();
        tom.sleep();

        System.out.println("================");

        // 创建狗
        final Dog jerry = new Dog("Jerry", 3);
        jerry.lookHome();
        jerry.eat();
        jerry.sleep();
    }
}
