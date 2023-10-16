package _04_AIP应用程序接口._03_Scanner;

import java.util.Scanner;

/**
 * ClassName:
 * Package: _04_AIP应用程序接口._03_Scanner._01_扫描键盘录入的基本类型数据$除char
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 22:44
 * @Version 1.0
 *
 * 通过 Scanner 对象扫描键盘录入的基本数据类型数据。
 *
 * 注意：
 *      1.Scanner 类没有提供 char 类型扫描的方法
 *      2.待扫描数据必须在扫描数据的数据类型的取值范围内，否则报错
 */
public class _01_扫描键盘录入的基本数据类型数据$除char {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner scanner = new Scanner(System.in);

        // 扫描键盘录入int类型数据
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        System.out.println("您输入的整数为：" + num);

        // 关闭资源
        scanner.close();
    }
}
