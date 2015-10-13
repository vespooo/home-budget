package dao;

import dao.data.MoneySource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tvalova on 22.09.2015.
 */
@Repository
public interface IMoneySourceRepository extends CrudRepository<MoneySource,Long>{

    public List<MoneySource> findByName(String name);
    public MoneySource save(MoneySource entity);
}
