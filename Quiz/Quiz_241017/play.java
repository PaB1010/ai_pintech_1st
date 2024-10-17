package Quiz_241017;

public class Play {
    public static void main(String[] args) {

       SlotInterface draw = new DrawRandomNumber();

       int result = draw.drawNumber(1,2,3);

        System.out.println(result);

    }
}
