package OnTapCuoiKi.Observer.CA6;

public class Dashboard implements PlayerDataListener{
    PlayerData playerData;

    public Dashboard(PlayerData playerData) {
        this.playerData = playerData;
        playerData.attach(this);
    }

    @Override
    public void listen(PlayerData data) {
        System.out.printf("Thoi gian con lai: "+ playerData.getThoiGian());
        System.out.printf("\nSo luot choi: "+ playerData.getCountDown());
        System.out.printf("\nSo diem dat duoc: "+ playerData.getGrade());
    }
}
