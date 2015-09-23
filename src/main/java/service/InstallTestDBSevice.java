package service;

import dao.IInstallDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tvalova on 18.09.2015.
 */
public class InstallTestDBSevice implements IInstallService {

    @Autowired
    private IInstallDao dao;

    @Override
    public void installGoalTable() {
        dao.installGoalTable();
    }

    @Override
    public void installMoneySourceTable() {
        dao.installMoneySourceTable();
    }

    @Override
    public void installMoneySourceFactTable() {
        dao.installMoneySourceFactTable();
    }

    @Override
    public void installPlansTable() {
        dao.installPlansTable();
    }

    @Override
    public void installPartitionTable() {
        dao.installPartitionTable();
    }

    @Override
    public void installPartitionFactTable() {
        dao.installPartitionFactTable();
    }

    @Override
    public void dropAll() {
        dao.dropAll();
    }
}
