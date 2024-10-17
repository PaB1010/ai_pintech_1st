package Quiz_241017;

public class RealPlayer extends Player{

    @Override
    int intoRandomCount(int Lv) {

        int test = Lv == 0 ? 4 : Lv == 1 ? 7 : 10;

        if (Lv > 2)
        {
            test = 1;
        }
        return test;
    }
}
