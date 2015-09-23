package dao;

import data.MoneyoneySource;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by tvalova on 22.09.2015.
 */
public interface IMoneySourceRepository extends CrudRepository<MoneyoneySource,Long>{

    public List<MoneyoneySource> findByName(String name);
    public MoneyoneySource save(MoneyoneySource entity);
}
