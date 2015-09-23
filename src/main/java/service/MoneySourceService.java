package service;

import dao.IMoneySourceRepository;
import data.MoneyoneySource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tvalova on 22.09.2015.
 */
public class MoneySourceService implements IMoneySourceService {

    @Autowired
    private IMoneySourceRepository repo;

    @Override
    public void findMoneySource(MoneyoneySource moneyoneySource) {
        //repo.findByName(moneyoneySource)
    }

    @Override
    public void save(MoneyoneySource moneyoneySource) {
        repo.save(moneyoneySource);
    }
}
