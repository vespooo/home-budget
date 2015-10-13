package service;

import dao.IGoalDao;
import dao.data.Goal;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by tvalova on 16.09.2015.
 */
public class GoalService implements IGoalService{

    @Autowired
    IGoalDao dao;

    public Goal find(String goal)
    {
        List<Goal> result = dao.findGoal(goal);
        if (result.size() ==1)
            return result.get(0);

        return null;
    }

    @Override
    public void save(Goal goal) {

        Goal oldGoal = find(goal.getName());
        if (oldGoal != null)
            dao.update(goal);
        else dao.insert(goal);
    }
}
