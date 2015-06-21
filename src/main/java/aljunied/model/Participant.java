package aljunied.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
//@ToString(exclude = { "event", "user" })
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Participant {

    @Id
    private int id;

    private int eventId;
    private int userId;
}
