package dao.data;


import javax.persistence.*;

/**
 * Created by tvalova on 22.09.2015.
 */

@Entity(name = "MONEY_SOURCE")
public class MoneySource {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
