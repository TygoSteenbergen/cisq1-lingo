package nl.hu.cisq1.lingo.trainer.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Round {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //Game is hier alleen om spring te laten werken.
    @ManyToOne
    private Game game;
    private int guesses = 5;
    private String word;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "feedback_id", referencedColumnName = "id")
    private Feedback feedback;

    public Round() {

    }

    public Round(String word) {
        this.word = word;
        String str = "_";
        List<Mark> marks = Feedback.markAttempt(str.repeat(word.length()), word);
        this.feedback = new Feedback(str.repeat(word.length()), marks);
    }
    public List<Mark> makeMarks(String attempt){
        return Feedback.markAttempt(attempt, word);
    }
    public Hint makeHint(List<Mark> marks){
        return feedback.giveHint(word, marks);
    }

    @Override
    public String toString() {
        return "Round{" +
                "id=" + id +
                ", guesses=" + guesses +
                ", word='" + word + '\'' +
                '}';
    }
    public void subtractGuesses(){
        guesses --;
    }
}
