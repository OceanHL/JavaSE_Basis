package _06_接口._09_默认方法的_注意事项;

/**
 * ClassName:
 * Package: _06_接口._09_默认方法的_注意事项
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/15 22:03
 * @Version 1.0
 */
public interface B {
    default void method() {
        System.out.println("接口B的默认方法");
    }
}
