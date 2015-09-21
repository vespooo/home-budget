package dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by tvalova on 19.09.2015.
 */
public class JdbcWrap implements IJdbcWrap{

    private final JdbcTemplate jdbc;

    public JdbcWrap(DataSource dataSource) {
        jdbc = new JdbcTemplate(dataSource);
    }

    @Override
    public void execute(String sql)
    {
        jdbc.execute(sql);
    }

    @Override
    public  <T> List<T> query(String sql, RowMapper<T> mapper) {

        return jdbc.query(sql, mapper);
    }

    @Override
    public void update(String sql) {
        jdbc.update(sql);
    }
}
