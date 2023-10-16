package _04_AIP应用程序接口._06_BigInteger$BigDecimal;

import java.math.BigDecimal;

/**
 * ClassName:
 * Package: _04_AIP应用程序接口._06_BigInteger$BigDecimal
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/16 21:33
 * @Version 1.0
 *
 * BigDecimal 类
 *      特点
 *          不可变的、任意精度的有符号十进制数。
 *      位置
 *          java.math
 *      构造器
 *          public BigDecimal(String val)
 *              将 BigDecimal 的字符串表示形式转换为 BigDecimal。
 *      方法
 */
public class _02_BigDecimal {
    public static void main(String[] args) {
        double var1 = 2.0;
        double var2 = 1.1;
        System.out.println(var1 - var2);

        final BigDecimal big1 = new BigDecimal(var1);
        final BigDecimal big2 = new BigDecimal(var2);
        System.out.println(big1.subtract(big2));

        final BigDecimal big3 = new BigDecimal("2.0");
        final BigDecimal big4 = new BigDecimal("1.1");
        System.out.println(big3.subtract(big4));

    }
}
