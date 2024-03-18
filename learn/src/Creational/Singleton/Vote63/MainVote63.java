package Creational.Singleton.Vote63;

public class MainVote63 {
    public static void main(String[] args){
        User u1 = new User("Loc");
        User u2 = new User("Thang");
        User u3 = new User("Tuan Anh");
        User u4 = new User("Kiet");
        u1.vote(Candidate.DONAL_TRUMP);
        u2.vote(Candidate.DONAL_TRUMP);
        u3.vote(Candidate.JOE_BIDEN);
        u4.vote(Candidate.DONAL_TRUMP);
        MyElection.getInstance().InKQ();
    }
}
