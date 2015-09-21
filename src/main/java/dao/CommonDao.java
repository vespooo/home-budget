package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by tvalova on 19.09.2015.
 */
public class CommonDao implements ICommonDao {


    @Autowired
    private IJdbcWrap jdbc;


    @Override
    public void dropAll() {
        jdbc.execute("DROP TABLE GOAL, MONEY_SOURCE, MONEY_SOURCE_FACT, PLANS, PARTITION, PARTITION_FACT IF EXISTS");
    }
}
