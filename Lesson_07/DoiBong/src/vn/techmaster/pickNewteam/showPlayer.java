package vn.techmaster.pickNewteam;

import vn.techmaster.coreTeam.Player;
import vn.techmaster.coreTeam.addPlayer;

import java.util.ArrayList;

public class showPlayer {
    public static void printPlayer(){
        ArrayList<Player> allPlayer = addPlayer.getData();
        System.out.println("Danh sách đội hình 22 cầu thủ tham gia thi đấu: " + "\n");
        for (Player subPlayer : allPlayer) {
            System.out.println(subPlayer + "\n");
        }
        System.out.println("-------------------------");
    }
}
