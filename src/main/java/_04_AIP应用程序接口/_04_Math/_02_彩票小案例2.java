package _04_AIP应用程序接口._04_Math;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ClassName:
 * Package: _04_AIP应用程序接口._04_Math
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/16 20:01
 * @Version 1.0
 */
public class _02_彩票小案例2 {
    public static void main(String[] args) {
        final ArrayList<Integer> list = new ArrayList<>();

        while (list.size() < 7) {
            // 1~35之间的整数
            int random = (int) (Math.random() * (35 - 1 + 1) + 1);

            // 判断指定数字在数组中是否存在
            if (!list.contains(random)) { // 不存在时
                list.add(random);
            }
        }

        // 集合排序
        Collections.sort(list);

        System.out.println("彩票:" + list);
    }
}
