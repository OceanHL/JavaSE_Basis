package _04_AIP应用程序接口._04_Math;

/**
 * ClassName:
 * Package: _04_AIP应用程序接口._04_Math
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/16 20:03
 * @Version 1.0
 */
public class _03_验证码案例 {
    public static void main(String[] args) {
        // 创建验证存储元素的数组
        final String[] arr = new String[62];// 26 + 26 + 10

        // 将验证内容存储到数组中
        for (int i = 0; i < arr.length; i++) {
            if (i >= 0 && i <= 9)
                arr[i] = String.valueOf((char)(i + 48));
            else if (i >= 10 && i <= 35)
                arr[i] = String.valueOf((char)(i + 55));
            else
                arr[i] = String.valueOf((char) (i + 61));
        }

        // 声明并初始化验证码变量
        String code = "";

        for (int i = 0; i < 5; i++) {
            // 0 ~ 61 -> (61 - 0 + 1) * Math.random() + 0
            int index = (int)(Math.random() * arr.length);
            code += arr[index];
        }

        System.out.println("验证码: " + code);
    }
}
