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
 * 动物行为的接口
 */
public interface AnimalInterface {
    // 需要子类进行重写
    void eat();

    // 不需要子类进行重写
    default void sleep() {
        System.out.println("动物睡觉");
    }
}
