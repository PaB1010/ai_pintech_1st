package Quiz_241017;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public abstract class Player implements RandomDraw {

    abstract int intoRandomCount(int Lv);

    @Override
    public void play() {

        int coin = 10;

        while (coin > 0) {

            Scanner sn = new Scanner(System.in);

            System.out.printf("난이도를 입력하세요.%n하 : 0%n중 : 1%n상 : 2%n");

            int random = sn.nextInt();

            RealPlayer Rp = new RealPlayer();

            int Lv = Rp.intoRandomCount(random);

            if (Lv == 1) {
                System.out.println("다시 입력해 주세요.");
                continue;
            }

            Random rd = new Random();

            int[] SlotNumber = new int[3];

            String[] SlotIcon = {"🍐","🍍","🥑","🍑","🍏","🍙","🍅","🥕","🍄","🍓"};

            int jackpot = 0;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    SlotNumber[j] = rd.nextInt(Lv);

                    System.out.print(SlotNumber[j]);
                }
                if (SlotNumber[0] == SlotNumber[1] && SlotNumber[1] == SlotNumber[2]) {jackpot++;}

                System.out.println(" ");
            }

            if (jackpot > 0) {System.out.printf("🤑 JACKPOT %s COMBO!! 🤑%n", jackpot);}
                coin -= 1;
            }
        System.out.println("코인을 모두 소모하였습니다.");
        }


    }


