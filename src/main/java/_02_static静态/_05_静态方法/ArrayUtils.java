package _02_static静态._05_静态方法;

/**
 * ClassName:
 * Package: _02_static静态._05_静态方法
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 20:43
 * @Version 1.0
 */
public  class ArrayUtils {
    // 按照固定格式打印(byte[])
    // 按照固定格式打印(short[])
    // 按照固定格式打印(int[])

    // 将构造器私有话，让外部无法创建实例
    private ArrayUtils() {
    }

    public static void print(int ...arr) {
        // 非空校验
        if (arr == null) {
            System.out.println("程序有误: 数组为null, 无法进行打印");
            return;
        }

        // 特殊值判断
        if (arr.length == 0) {
            System.out.println("数组: []");
            return;
        }

        System.out.print("数组:[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }
}
