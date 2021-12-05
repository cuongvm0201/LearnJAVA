package vn.techmaster.coreTeam;

public class Player {
    private int idNumber;
    private String name;
    private Position position;

    public Player(int idNumber, String name, Position position) {
        this.idNumber = idNumber;
        this.name = name;
        this.position = position;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player:" + "\n"+'{' +
                "Số Áo: " + idNumber + "--" +
                "Tên cầu thủ: " + name + "--" +
                "Vị trí: " + position +
                '}';
    }
}
