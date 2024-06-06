package OnTapCuoiKi.Observer.CA6;

public class MainCA6 {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData();
        Dashboard dashboard = new Dashboard(playerData);
        playerData.setPlayerData(30,3,300);

    }
}
