import dto.Student;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 2017/10/29.
 */
public class Tests {

    /**
     * 1.考虑用静态工厂方法代替构造器
     * 2.遇到多个构造器参数时要考虑用构建器
     * 3.用私有构造器或枚举类强化单例
     * 4.通过私有构造器强化不可实例化的能力
     * 5.避免创建不必要的对象
     * 6.消除过期的对象引用ZZZZZAAAAAAAAAa
     * 7.避免使用终结方法
     */

    /**
     * 1.覆盖equals时请遵守通用约定
     * 2.覆盖equals时总要覆盖hashcode
     * 3.始终要覆盖toString
     * 4.谨慎地覆盖clone方法
     * 5.考虑实现comparable接口
     */


    /**
     * 1.使类和成员的可访问性最小化
     * 2.在公有类中使用访问方法而非共有域
     * 3.使可变性最小化
     * 4.复合优先于继承
     * 5.要么为继承而设计，并提供文档说明，要么禁止用继承
     * 6.接口优于抽象类
     * 7.接口只用于定义类型
     * 8.类层次优于标签类
     * 9.函数对象表示策略
     * 10.优先考虑静态成员类
     */
    @Test
    public void test(){
        Set<Student> set = new HashSet();

    }
}
