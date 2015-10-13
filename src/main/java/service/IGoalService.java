package service;

import dao.data.Goal;

/**
 * Created by tvalova on 16.09.2015.
 */
public interface IGoalService {
    public Goal find(String goal);

    void save(Goal goal);
}
