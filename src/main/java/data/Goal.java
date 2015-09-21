package data;

import java.sql.Date;

/**
 * Created by tvalova on 16.09.2015.
 */
public class Goal {
    private int id;
    private String name;
    private int repeat;
    private Date oneDate;
    private Date startDate;
    private Date endDate;
    private int summ;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setOneDate(Date oneDate) {
        this.oneDate = oneDate;
    }

    public Date getOneDate() {
        return oneDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    public int getSumm() {
        return summ;
    }
}
