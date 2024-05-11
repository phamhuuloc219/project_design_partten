package behavioral.observer.CA6;

public class Dashboard implements PlayerDataListener{
    PlayerData playerData;

    public Dashboard(PlayerData playerData) {
        this.playerData = playerData;
        playerData.attach(this);
    }

    @Override
    public void listen(PlayerData data) {
        System.out.println("Thời gian còn lại: " + playerData.getThoiGian());
        System.out.println("Số lượt chơi còn lại: " + playerData.getCountdown());
        System.out.println("Điểm số đạt được: " + playerData.getGrade());
        System.out.println();

    }
}
