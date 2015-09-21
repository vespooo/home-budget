package dao;

import org.springframework.jdbc.core.RowMapper;

import java.util.List;

/**
 * Created by tvalova on 19.09.2015.
 */
public interface IJdbcWrap {
    void execute(String sql);


    <T> List<T> query(String sql, RowMapper<T> mapper);

    void update(String sql);
}
