package behavioral.observer.CA6;

public class MainPlayer {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData();

        Dashboard dashboard = new Dashboard(playerData);

        playerData.setPlayerData(60, 5, 100);
        playerData.setPlayerData(30, 3, 200);
        playerData.setPlayerData(10, 1, 300);
    }
}
