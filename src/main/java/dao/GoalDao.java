package dao;

import data.Goal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by tvalova on 17.09.2015.
 */
public class GoalDao implements IGoalDao{

    private JdbcTemplate jdbc;

    public GoalDao(DataSource dataSource) {
        jdbc = new JdbcTemplate(dataSource);
    }
    @Override
    public List<Goal> findGoal(String goal) {
        return jdbc.query("select id, name, repeat,one_date, start_date, end_date, summ from GOAL where name like '" + goal +"'", new GoalMapper());

    }

    @Override
    public void insert(Goal goal) {

        jdbc.update("insert into GOAL set name='" + goal.getName() +
                "', repeat="+ goal.getRepeat() +
                ", one_date=" + goal.getOneDate() +
                ", start_date=" + goal.getStartDate() +
                ", end_date=" + goal.getEndDate() +
                ", summ=" + goal.getSumm());
    }

    @Override
    public void update(Goal goal) {
        jdbc.update("update GOAL set repeat="+ goal.getRepeat() +
                                ", one_date=" + goal.getOneDate() +
                                ", start_date=" + goal.getStartDate() +
                                ", end_date=" + goal.getEndDate() +
                                ", summ=" + goal.getSumm() +
                                " where name=" +goal.getName());
    }



    private static final class GoalMapper implements RowMapper<Goal> {
        public Goal mapRow(ResultSet rs, int rowNum) throws SQLException {
            Goal goal = new Goal();
            goal.setId(rs.getInt("id"));
            goal.setName(rs.getString("name"));
            goal.setRepeat(rs.getInt("repeat"));
            goal.setOneDate(rs.getDate("one_date"));
            goal.setStartDate(rs.getDate("start_date"));
            goal.setEndDate(rs.getDate("end_date"));
            goal.setSumm(rs.getInt("summ"));

            return goal;
        }
    }
}
