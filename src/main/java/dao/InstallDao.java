package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by tvalova on 18.09.2015.
 */
public class InstallDao implements IInstallDao{

    @Autowired
    private IJdbcWrap jdbc;


    @Override
    public void installGoalTable() {
        jdbc.execute("create table GOAL (id int NOT NULL AUTO_INCREMENT, name varchar, summ int, repeat int, one_date DATE, start_date date, end_date date)");
    }



    @Override
    public void installMoneySourceTable() {
        jdbc.execute("create table MONEY_SOURCE (id int, name varchar, summ int, date DATE)");
    }

    @Override
    public void installMoneySourceFactTable() {
        jdbc.execute("create table MONEY_SOURCE_FACT (id int, plan_id int, summ int, date DATE)");

    }

    @Override
    public void installPlansTable() {
        jdbc.execute("create table PLANS (id int, name VARCHAR )");
    }

    @Override
    public void installPartitionTable() {
        jdbc.execute("create table PARTITION (plan_id int, money_source_id int, goal_id int, summ int )");
    }

    @Override
    public void installPartitionFactTable() {
        jdbc.execute("create table PARTITION_FACT(plan_id int, plan_fact_id int, money_source_id int, goal_id int, summ int )");

    }
}
