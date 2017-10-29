import dto.Student;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 2017/10/29.
 */
public class Tests {

    @Test
    public void test(){
    /*    Integer integer = new Integer(1);
        integer.*/
        Set<Student> set = new HashSet();
        Student s1 = new Student();
        s1.setName("bbb");
        s1.setAge(111);
        Student s2 = new Student();
        s2.setName("bbb");
        s2.setAge(111);
        set.add(s1);
        set.add(s2);
        System.out.println(s1.equals(s2));
        for (Student item:set){
            System.out.println(item);
        }
        s1.setName("bbb");
        System.out.println(s1.equals(s2));
        for (Student item:set){
            System.out.println(item);
        }
    }
}
