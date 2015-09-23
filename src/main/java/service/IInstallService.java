package service;

/**
 * Created by tvalova on 18.09.2015.
 */
public interface IInstallService {
    void installGoalTable();

    void installMoneySourceTable();

    void installMoneySourceFactTable();

    void installPlansTable();

    void installPartitionTable();

    void installPartitionFactTable();

    void dropAll();
}
