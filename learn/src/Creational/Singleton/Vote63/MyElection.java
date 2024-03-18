package Creational.Singleton.Vote63;

import java.util.ArrayList;
import java.util.List;

//
public class MyElection {
    private int biden=0, trump=0;
    private static MyElection instance;
    protected MyElection(){}
    List<String> users = new ArrayList<>();
    public static MyElection getInstance(){
        if(instance == null){
            instance = new MyElection();
        }
        return instance;
    }
    public void vote(Candidate c,String user){
        if(!isVoted()){
            if(c==Candidate.DONAL_TRUMP){
                trump++;
            }
            else if(c==Candidate.JOE_BIDEN){
                biden++;
            }
            users.add(user);
        }

    }
    private boolean isVoted(){
        return false;
    }
    public void InKQ(){
        System.out.println("Donal Trump: " + trump);
        System.out.println("Joe Biden: " + biden);
    }
}
