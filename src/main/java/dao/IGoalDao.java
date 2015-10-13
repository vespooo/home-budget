package dao;

import dao.data.Goal;

import java.util.List;

/**
 * Created by tvalova on 16.09.2015.
 */
public interface IGoalDao {
    List<Goal> findGoal(String goal);

    void update(Goal goal);

    void insert(Goal goal);
}
