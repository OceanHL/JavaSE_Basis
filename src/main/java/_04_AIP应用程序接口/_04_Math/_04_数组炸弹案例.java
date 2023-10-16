package _04_AIP应用程序接口._04_Math;

import java.util.Scanner;

/**
 * ClassName:
 * Package: _04_AIP应用程序接口._04_Math
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/16 20:20
 * @Version 1.0
 *
 * 数字炸弹
 *      随机生成一个1~100之间的整数，玩家通过键盘录入的方式在指定范围内进行猜数，每次猜的结果系统会进行提示,直到玩家猜中为止
 *          如果猜的数字大于系统生成的数字，提示大了
 *          如果猜的数字小于系统生成的数字，提示小了
 *          如果猜的数字等于系统生成的数字，恭喜你，猜中了
 */
public class _04_数组炸弹案例 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int random = (int)(Math.random() * 100 + 1);

        // 声明并初始化猜数字的范围变量
        int start = 1;
        int end = 100;

        isWin:while (true) { // 只要没有赢，一直循环
            System.out.println("请输入一个" + start + "~" + end + "之间的整数：");
            int num = scanner.nextInt();

            // 进行健壮性判断
            if (num < start || num > end) {
                System.out.println("输入的数字不在指定范围内，请重新输入");
                continue;
            }

            if (num == random) {
                System.out.println("恭喜你，猜中了");
                break isWin; // 跳出 while 循环
            } else if (num > random) {
                System.out.println("大了");
                end = num - 1;
            } else {
                System.out.println("小了");
                start = num + 1;
            }
        }

        // 关闭资源
        scanner.close();
    }
}
