package _01_面向对象._14_构造器代码块;

/**
 * ClassName: Main
 * Package: _01_面向对象._14_构造器代码块
 * Description: 测试构造器代码块
 * @Author Ocean_jhl
 * @Create 2023/10/10 21:45
 * @Version 1.0
 *
 * 构造器代码块
 *      位置：
 *          在类中代码块外
 *      格式：
 *          {
 *              所有构造器中相同的内容
 *          }
 *      特点：
 *          1.构造器代码块优先于构造器中的显示代码执行
 *          2.所有构造器共用一个构造器代码块，便于抽取，在实例初始化过程中的第二阶段调用构造器代码块
 *
 */
public class Main {
    public static void main(String[] args) {
        new ConstructorCodeBlock();

        System.out.println("==============================");

        new ConstructorCodeBlock(1);

        new ConstructorCodeBlock(1,2);
    }
}
