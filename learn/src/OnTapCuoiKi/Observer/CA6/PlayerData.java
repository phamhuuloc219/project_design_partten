package OnTapCuoiKi.Observer.CA6;

import java.util.ArrayList;
import java.util.List;

public class PlayerData implements PlayerDataListener{
    int thoiGian, countDown, grade;

    public PlayerData(int thoiGian, int countDown, int grade) {
        this.thoiGian = thoiGian;
        this.countDown = countDown;
        this.grade = grade;
    }
    List<PlayerDataListener> listener;
    public PlayerData() {
        listener = new ArrayList<>();
    }
    public void attach(PlayerDataListener listener) { this.listener.add(listener); }
    public void detach(PlayerDataListener listener) { this.listener.remove(listener);}
    public void setPlayerData(int thoiGian, int countDown, int grade) {
        this.thoiGian = thoiGian;
        this.countDown = countDown;
        this.grade = grade;
        notifyListener();
    }
    void notifyListener(){
        for(PlayerDataListener listeners : listener){
            listeners.listen(this);
        }
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public int getCountDown() {
        return countDown;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public void listen(PlayerData data) {

    }
}
