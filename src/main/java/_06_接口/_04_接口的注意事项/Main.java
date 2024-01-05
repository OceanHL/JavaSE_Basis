package _06_接口._04_接口的注意事项;

/**
 * ClassName:
 * Package: _06_接口._04_接口的注意事项
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/15 20:49
 * @Version 1.0
 *
 * 接口的注意事项：
 *      1. 接口中没有构造器，无法实例化对象
 *      2. 类，接口间的三种关系：
 *          类与类之间的关系：单继承关系
 *          类与接口之间的关系：多实现关系
 *          接口与接口之间的关系：多继承关系
 *              格式：
 *                  public interface 接口名 extends 父接口1,父接口2,父接口3...{}
 *      3. 接口无法直接使用，需要声明接口的实现类
 *      4. 接口中的成员是固定不变的，只能包含六大成员
 *               接口的成员：
                    1. 静态常量
                    2. 抽象方法
                    3. 默认方法(JDK-8)
                    4. 静态方法(JDK-8)
                    5. 私有方法(JDK-9)
                    6. 内部接口
 */
public class Main {
    public static void main(String[] args) {
        // 接口无法实例化对象
        // SuperInterface superInterface = new SuperInterface();
    }
}
