package _04_AIP应用程序接口._04_Math;

/**
 * ClassName:
 * Package: _04_AIP应用程序接口._04_Math
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/16 19:40
 * @Version 1.0
 */
public class _01_彩票小案例1 {
    public static void main(String[] args) {
        // 创建长度为7的数组
        final int[] arr = new int[7];
        System.out.println(arr);

//        for (int i = 0; i < arr.length; i++) {
//            // 1~35之间的整数
//            int random = (int) (Math.random() * (35 - 1 + 1) + 1);
//            arr[i] = random;
//        }

        // 声明并初始化数组存储的索引变量
        int index = 0;

        while (arr[arr.length - 1] == 0) {
            // 1~35之间的整数
            int random = (int) (Math.random() * (35 - 1 + 1) + 1);

            // 判断指定数字在数组中是否存在
            final boolean flag = getFlag(arr, random);
            if (!flag) { // 不存在时
                arr[index] = random;
                index++;
            }
        }

        System.out.print("彩票:[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    // 判断指定数字在数组中是否存在（不存在false，存在true）
    public static boolean getFlag(int[] arr, int num) {
        // 默认每个元素在数组中不存在（不存在false，存在true）
        boolean flag = false;

        // 非空校验
        if (arr == null || arr.length == 0) {
            System.out.println("程序有误：数组不能为空");
            return true;
        }

        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]) {
                flag = true;
                break;
            }
        }

        return flag;
    }
}
