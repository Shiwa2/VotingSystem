package Model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Voter {


    @Column(name = "Voter_id")
    private Long id;
    private String  votingHistory;
    private String  currentVote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVotingHistory() {
        return votingHistory;
    }

    public void setVotingHistory(String votingHistory) {
        this.votingHistory = votingHistory;
    }

    public String getCurrentVote() {
        return currentVote;
    }

    public void setCurrentVote(String currentVote) {
        this.currentVote = currentVote;
    }
}

