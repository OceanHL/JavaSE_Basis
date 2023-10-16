package _04_AIP应用程序接口._05_Arrays;

import java.util.Arrays;

/**
 * ClassName:
 * Package: _04_AIP应用程序接口._05_Arrays
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/16 20:40
 * @Version 1.0
 *
 * Arrays 类
 *      特点
 *          针对数组进行操作的工具类
 *      位置
 *          java.util
 *      构造器
 *          构造器私有化
 *      方法
 *          public static int binarySearch(int[] a, int key)
 *              使用二分搜索法来搜索指定的 int 型数组，以获得指定的值。
 *          public static String toString(int[] a)
 *              返回指定数组内容的字符串表示形式。
 *          public static boolean[] copyOf(boolean[] original,int newLength)
 *              复制指定的数组，截取或用 false 填充（如有必要），以使副本具有指定的长度。
 *          public static void sort(int[] a, int fromIndex, int toIndex)
 *              对指定 int 型数组的指定范围按数字升序进行排序。
 *
 * 注意事项：
 *      如果使用Array.sort()进行自定义对象数组排序，需要手动给其指定比较规则(定义比较器)
 *          比较器实现分类：
 *              自然顺序比较器：
 *                  实现Comparable<T>，重写compareTo(T o)方法
 *              定制顺序比较器：
 *                  实现Comparator<T>，重写compare(T o1, T o2)方法
 */
public class Main {
    public static void main(String[] args) {
        // 声明并初始化数组，乱序
        int[] arr1 = {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};
        String[] arr2 = {"cba", "bac", "acb", "cab", "abc", "bca", "尚硅谷", "0", "ABC"};

        Student stu1 = new Student("去病", 18);
        Student stu2 = new Student("卫小青", 18);
        Student stu3 = new Student("张小赛", 18);
        Student stu4 = new Student("波斯客", 18);

        Student[] arr3 = {stu1, stu2, stu3, stu4};


        // 以固定格式打印数组中元素
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("======================");

        // 以指定的长度复制新数组
        int[] newArr1 = Arrays.copyOf(arr1, 5);
        int[] newArr2 = Arrays.copyOf(arr1, 15);
        String[] newArr3 = Arrays.copyOf(arr2, 15);

        System.out.println(Arrays.toString(newArr1));
        System.out.println(Arrays.toString(newArr2));
        System.out.println(Arrays.toString(newArr3));

        System.out.println("======================");

        // sort排序
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("======================");

        // 使用二分查找方式查询指定元素出现的第一次索引
        int index = Arrays.binarySearch(arr1, 3);
        System.out.println("index = " + index);
    }
}
