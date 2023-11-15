package _05_extends._15_final关键字._06_实例常量;

/**
 * ClassName:
 * Package: _05_extends._15_final关键字._06_实例常量
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/8 22:27
 * @Version 1.0
 */
public class FinalObjectVar {
    // 直接声明初始化实例常量
    final int NUM = 10;

    // 先声明后初始化实例变量
    final int VALUE;

    public FinalObjectVar(int VALUE) {
        this.VALUE = VALUE;
    }

    public FinalObjectVar(String VALUE) {
        this.VALUE = 10;
    }
}
