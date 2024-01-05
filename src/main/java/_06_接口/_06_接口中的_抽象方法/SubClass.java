package _06_接口._06_接口中的_抽象方法;

/**
 * ClassName:
 * Package: _06_接口._06_接口中的_抽象方法
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/15 21:30
 * @Version 1.0
 */
public class SubClass implements SuperInterface {
    @Override
    public void method() {
        System.out.println("SubClass");
    }
}
