package Creational.Singleton.Vote63;

public class User {
    String name;
    public User(String name) {
        this.name = name;

    }
    public void vote(Candidate c){
        MyElection.getInstance().vote(c,name);
    }
}
