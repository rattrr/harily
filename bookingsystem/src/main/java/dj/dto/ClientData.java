package dj.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientData {
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Gender gender;

    public ClientData(long id, String firstName, String lastName, String phoneNumber, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
}
