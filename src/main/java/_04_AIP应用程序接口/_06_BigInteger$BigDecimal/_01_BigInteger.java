package _04_AIP应用程序接口._06_BigInteger$BigDecimal;

import java.math.BigInteger;

/**
 * ClassName:
 * Package: _04_AIP应用程序接口._06_BigInteger
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/16 21:26
 * @Version 1.0
 *
 * BigInteger 类
 *      特点
 *          不可变的任意精度的整数工具类
 *      位置
 *          java.math
 *      构造器
 *          BigInteger(String val) 将 BigInteger 的十进制字符串表示形式转换为 BigInteger 对象
 *      方法
 */
public class _01_BigInteger {
    public static void main(String[] args) {
        // 创建BigInteger对象
        final BigInteger big1 = new BigInteger("12345678901234567890");
        final BigInteger big2 = new BigInteger("1");

        BigInteger result = big1.add(big2);

        System.out.println(result);
    }
}
