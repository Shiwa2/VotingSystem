package Model;

import javax.persistence.*;

@Entity
public class Candidate {
    @Column(name = "Candidate_id")
    private Long authorizationCode;
    private String  votingHistory;
    private String  currentVote;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(Long authorizationCode) {
        this.authorizationCode = authorizationCode;
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
