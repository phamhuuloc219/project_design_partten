package behavioral.observer.CA2;

public class Button {
    String name;
    Activity activity;

    public Button(String name, Activity activity) {
        this.name = name;
        this.activity = activity;
    }

    public void click() {
        activity.notifyClick(name);
    }
}
