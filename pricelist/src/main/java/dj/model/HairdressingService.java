package dj.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class HairdressingService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int price;
    private int durationInMinutes;
    @ManyToOne
    private Category category;

    public HairdressingService(String name, int price, int duration) {
        this.name = name;
        this.price = price;
        this.durationInMinutes = duration;
    }
}
