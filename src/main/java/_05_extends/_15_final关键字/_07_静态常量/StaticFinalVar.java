package _05_extends._15_final关键字._07_静态常量;

/**
 * ClassName:
 * Package: _05_extends._15_final关键字._07_静态常量
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/8 22:39
 * @Version 1.0
 */
public class StaticFinalVar {
    // 先声明后初始化静态常量
    static final int NUM = 123;

    // 先声明后初始化静态常量
    static final int VALUE;

    static {
        VALUE = 10;
    }
}
