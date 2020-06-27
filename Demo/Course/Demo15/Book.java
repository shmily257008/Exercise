import java.util.Objects;

public class Book {
    private int id;
    private String name;


    public Book(int id, String name) {
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);//原有的equals方法是判断内存地址的对象是否相等
        Book b = (Book) obj;
        return this.id==b.id; //判断传入函数的具体变量值与this 的值相等
    }
}
