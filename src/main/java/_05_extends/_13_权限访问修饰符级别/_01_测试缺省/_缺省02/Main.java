package _05_extends._13_权限访问修饰符级别._01_测试缺省._缺省02;

import _05_extends._13_权限访问修饰符级别._01_测试缺省._缺省01.SubClass;
/**
 * ClassName:
 * Package: _05_extends._13_权限访问级别
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/6 21:08
 * @Version 1.0
 *
 * 权限访问级别：
 *      含义：权限访问级别其实就是封装思想的核心体现
 *      分类（从小到大）：
 *          private < 缺省 < protected < public
 *      修饰范围：
 *          private 权限访问级别：
 *              修饰范围：被private修饰的内容只能在【本类中】进行访问和使用，在本类之外无法进行访问和使用，否则编译报错
 *          缺省 权限访问级别：
 *              修饰范围：
 *                  1. 兼容 private 权限访问级别的修饰范围
 *                  2. "缺省"权限，只能在【本包】中进行访问和使用，在本包之外无法进行访问和使用，，否则编译报错
 *          protected 权限访问级别：
 *              修饰范围：
 *                  1. 兼容 "缺省" 权限访问级别的修饰范围
 *                  2. 被protected修饰的内容只能在【同一个项目】中且具有【子父类继承关系】中使用，如果跨包访问且没有继承关系编译报错
 *                  (如果涉及同一项目但不同模块，需要修改项目的配置文件【workspace.xml】)
 *          public 权限访问级别：
 *              修饰范围：
 *                  1. 兼容 protected 权限访问级别的修饰范围
 *                  2. 被 public 修饰的内容只能在同一个项目中进行访问和使用，超出项目之外无法进行访问和使用，否则编译报错。
 *                   (如果涉及同一项目但不同模块，需要修改项目的配置文件【workspace.xml】)
 *  如何跨项目访问数据？
 *      序列化和反序列化（对象流）
 *      1. 跨模块访问数据：需要修改项目的配置文件【workspace.xml】
 *      2. 跨项目访问数据：需要借助网络框架，如：http、https、ftp、rpc、webservice
 */
public class Main {
    public static void main(String[] args) {
        // 创建SubClass对象
        SubClass sc = new SubClass();
        System.out.println(sc.num);
    }
}
