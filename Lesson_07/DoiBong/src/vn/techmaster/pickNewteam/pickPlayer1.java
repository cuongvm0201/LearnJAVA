package vn.techmaster.pickNewteam;

import vn.techmaster.coreTeam.Player;
import vn.techmaster.coreTeam.Position;
import vn.techmaster.coreTeam.addPlayer;

import java.util.ArrayList;
import java.util.Random;

public class pickPlayer1 {
    public static void randomPick1(){
        ArrayList<Player> allPlayer = addPlayer.getData();
        ArrayList<Player> selectedTeam = new ArrayList<>();
        Random general = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwarderSize = 0;
        System.out.println("List cầu thủ mô hình 1GK - 4DF - 3MF - 3FW: ");
        while (gateKeeperSize < 1) {
            int rdGateKeeper = general.nextInt(22);
            if (allPlayer.get(rdGateKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(allPlayer.get(rdGateKeeper));
                gateKeeperSize++;
            }

        }
        while (defenderSize < 4) {
            int rdDefender = general.nextInt(22);
            if (allPlayer.get(rdDefender).getPosition().equals(Position.DF)
                    && !selectedTeam.contains(allPlayer.get(rdDefender))) {//Sử dụng contains để kiểm tra xem cầu thủ đó đã có trong danh sách chưa, nếu chưa thêm vào danh sách
                selectedTeam.add(allPlayer.get(rdDefender));
                defenderSize++;
            }

        }
        while (midFieldSize < 3) {
            int rdmidField = general.nextInt(22);
            if (allPlayer.get(rdmidField).getPosition().equals(Position.MF)
                    && !selectedTeam.contains(allPlayer.get(rdmidField))) {//Sử dụng contains để kiểm tra xem cầu thủ đó đã có trong danh sách chưa, nếu chưa thêm vào danh sách
                selectedTeam.add(allPlayer.get(rdmidField));
                midFieldSize++;
            }

        }
        while (forwarderSize < 3) {
            int rdForwarder = general.nextInt(22);
            if (allPlayer.get(rdForwarder).getPosition().equals(Position.FW)
                    && !selectedTeam.contains(allPlayer.get(rdForwarder))) {//Sử dụng contains để kiểm tra xem cầu thủ đó đã có trong danh sách chưa, nếu chưa thêm vào danh sách
                selectedTeam.add(allPlayer.get(rdForwarder));
                forwarderSize++;
            }
        }
        for (Player s1: selectedTeam){
            System.out.println("Số áo: "+ s1.getIdNumber()+" -"+ " Tên cầu thủ: " +s1.getName()+" -"+" Vị trí: " + s1.getPosition());
        }
        System.out.println("-------------------------");
    }
}
