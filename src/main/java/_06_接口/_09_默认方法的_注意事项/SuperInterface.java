package _06_接口._09_默认方法的_注意事项;

/**
 * ClassName:
 * Package: _06_接口._09_默认方法的_注意事项
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/15 21:59
 * @Version 1.0
 */
public interface SuperInterface {
    default void method() {
        System.out.println("父接口的默认方法");
    }
}
