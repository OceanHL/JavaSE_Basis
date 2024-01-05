package _06_接口._05_接口中的_静态常量;

/**
 * ClassName:
 * Package: _06_接口._05_接口中的_静态常量
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/15 20:58
 * @Version 1.0
 *
 * 接口中的静态常量
 *      含义：
 *          声明在接口中的静态常量，其实质是接口的常量。
 *      格式：
 *          public static final 数据类型 常量名 = 值;
 *      调用：
 *          接口名.常量名
 *      注意事项：
 *          1. 接口中的静态常量无法先声明后初始化，因为无法使用静态代码块
 *          2. public, static, final 这三个关键字缺少那个，JVM的编译器会在【编译时】自动补全
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(SuperInterface.NUM);
    }
}
