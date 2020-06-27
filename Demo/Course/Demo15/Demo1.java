import lombok.Getter;
import lombok.Setter;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

@Getter
@Setter
public class Demo1 {
    /*LinkList的使用
    * 特点：无序，不重复*/

    //arrayList 去重复
    public static void main(String[] args) {
        ArrayList Alist1= new ArrayList();
        // 合理add 括号内的是添加对象 ，这里需要将new book 转换成对象

        Alist1.add(new Book(110,"java编程思想"));
        Alist1.add(new Book(111,"java核心技术"));
        Alist1.add(new Book(112,"web技术"));
        Alist1.add(new Book(110,"java学习路线"));

//        System.out.println(Alist1);
        //这里出现了ArrayList 参数值为空的时候， 需要重点解决与记录

        //这里做一个去重的ArrayList 集合
           //这里判断的是一个对象是否重复
        ArrayList newlist=ClearRepear(Alist1);
        System.out.println(newlist);

            //这里是判断ID 是否重复(需要重新equals方法)


    }

    public static  ArrayList ClearRepear(ArrayList Alist1){
        ArrayList newlist=new ArrayList();
        //先做一个获取迭代器的操作
        Iterator it =Alist1.iterator();
        while (it.hasNext()){
            Book d= (Book) it.next(); //next返回的是object 类型
            if(!newlist.contains(d)){
                newlist.add(d);
            }


        }

//        System.out.println(newlist);
        return newlist;
    }
}
