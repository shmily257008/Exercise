import java.util.LinkedList;

public class Pocker {
    String color;
    String num;
    LinkedList pai;

    public Pocker(String color, String num) {
        this.color = color;
        this.num = num;


    }

    int i = 0;

    public LinkedList pais() {
        String[] colors = {"红桃", "黑桃", "方块", "梅花"};
        String[] nums = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "P", "K"};
        for (i = 0; i < colors.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                pai.add(new Pocker(colors[i], nums[j]));
            }
        }
        System.out.println(pai);
        return pai;
    }


}
