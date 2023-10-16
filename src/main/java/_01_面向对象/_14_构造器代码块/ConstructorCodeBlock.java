package _01_面向对象._14_构造器代码块;

/**
 * ClassName: ConstructorCodeBlock
 * Package: _01_面向对象._14_构造器代码块
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/10 21:45
 * @Version 1.0
 */
public class ConstructorCodeBlock {
    // 构造器代码块
    {
        System.out.println("你好");
        System.out.println("我好");
        System.out.println("大家好");
    }
    public ConstructorCodeBlock() {
//        System.out.println("你好");
//        System.out.println("我好");
//        System.out.println("大家好");
        System.out.println("喵喵老师好");
    }
    public ConstructorCodeBlock(int num) {
//        System.out.println("你好");
//        System.out.println("我好");
//        System.out.println("大家好");
        System.out.println("莎莎老师好");
    }

    public ConstructorCodeBlock(int a, int b) {
        System.out.println("海江老师人生赢家");
    }
}
