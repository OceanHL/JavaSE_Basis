package _02_static静态._09_单例模式_延迟加载模式;

/**
 * ClassName:
 * Package: _02_static静态._09_单例模式_延迟加载模式
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 21:40
 * @Version 1.0
 */
public class CEO {
    private static CEO ceo; // 不进行初始化

    private CEO() {}

    public static CEO getCEO() {
        //  第一次调用时初始化
        if (ceo == null) {
            ceo = new CEO();
        }
        return ceo;
    }
}
