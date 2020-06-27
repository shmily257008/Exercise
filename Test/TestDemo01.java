import java.util.ArrayList;

public class TestDemo01 {
    public static void main(String[] args) {
        Person p1=new Person("张三",19);
        Person p2=new Person("李四",20);
        ArrayList a1=new ArrayList();
        a1.add(p1);
        a1.add(p2);
        System.out.println(a1);

    }
}
