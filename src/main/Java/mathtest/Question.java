package mathtest;

import java.util.concurrent.ThreadLocalRandom;

import jakarta.persistence.*;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;

    private String content, answer;

    public Question() {  // Constructor
        int a = ThreadLocalRandom.current().nextInt(1, 10); // simplified range
        int b = ThreadLocalRandom.current().nextInt(1, 10); // simplified range
        this.content = a + " + " + b + " = ";
        this.answer = Integer.toString(a + b);
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAnswer() {
        return answer;
    }
}
