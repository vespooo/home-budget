package service;

import dao.IMoneySourceRepository;
import dao.data.MoneySource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tvalova on 22.09.2015.
 */
public class MoneySourceService implements IMoneySourceService {

    @Autowired
    private IMoneySourceRepository repo;

    @Override
    public void findMoneySource(MoneySource moneySource) {
        //repo.findByName(moneyoneySource)
    }

    @Override
    public void save(MoneySource moneySource) {
        repo.save(moneySource);
    }
}
