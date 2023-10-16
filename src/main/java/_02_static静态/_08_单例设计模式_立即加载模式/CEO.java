package _02_static静态._08_单例设计模式_立即加载模式;

/**
 * ClassName: CEO
 * Package: _02_static静态._08_单例设计模式
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 21:28
 * @Version 1.0
 */
public class CEO {
    private static CEO ceo = new CEO();

    private CEO() {}

    public static CEO getCeo() {
        return ceo;
    }
}
