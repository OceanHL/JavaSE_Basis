package _04_AIP应用程序接口._02_System;

/**
 * ClassName:
 * Package: _04_AIP应用程序接口._02_system
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 22:17
 * @Version 1.0
 *
 * System类
 *      类的特点：
 *          针对程序中常用的字段和方法进行封装的工具类
 *      类的位置：
 *          java.lang包
 *      类的构造器：
 *          构造器私有化
 *      类的成员
 *          public static final InputStream in
 *              “标准”输入流。此流已打开并准备提供输入数据。
 *          public static final PrintStream out
 *              “标准”输出流。此流已打开并准备提供输出数据。
 *          public static final PrintStream err
 *              “标准”错误输出流。
 *          public static long currentTimeMillis()
 *              返回以毫秒为单位的当前时间。
 *          public static void gc()
 *              运行垃圾回收器。
 *          public static void setOut(PrintStream out)
 *              重新分配“标准”输出流。
 *          public static long nanoTime()
 *              返回最准确的可用系统计时器的当前值，以毫微秒为单位。
 */
public class Main {
    public static void main(String[] args) {
        // 获取当前时间【毫秒】
        // long start = System.currentTimeMillis();
        // 获取当前时间【纳秒】
        long start = System.nanoTime();

        for (int i = 0; i < 10000; i++) {

        }

        // long end = System.currentTimeMillis();
        long end = System.nanoTime();
        // System.out.println("程序运行时间：" + (end - start) + "毫秒");
        System.out.println("程序运行时间：" + (end - start) + "纳秒");
    }
}
