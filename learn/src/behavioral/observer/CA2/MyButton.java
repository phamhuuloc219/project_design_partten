package behavioral.observer.CA2;

import java.util.ArrayList;
import java.util.List;

public class MyButton {
    String name;
    Activity activity;
    List<onClickListener> onClickListeners = new ArrayList<>();
    int count = 0;
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void click() {
        count++;
        System.out.println("Button " + name + " đã click số lần: " + count);
        notifyOnClickListeners();
    }

    public void addOnClickListener(onClickListener listener) {
        onClickListeners.add(listener);
    }

    private void notifyOnClickListeners() {
        for (onClickListener listener : onClickListeners) {
            listener.onClick();
        }
    }

    public static interface onClickListener{
        void onClick();
    }
}
