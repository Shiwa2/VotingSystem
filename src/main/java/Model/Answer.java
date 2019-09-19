package Model;

import javax.persistence.*;

@Entity
public class Answer {
    @Column(name = "Answer_id")
    private  Long id;
    private String question_email;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion_email() {
        return question_email;
    }

    public void setQuestion_email(String question_email) {
        this.question_email = question_email;
    }
}
