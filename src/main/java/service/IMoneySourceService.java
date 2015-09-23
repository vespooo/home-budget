package service;

import data.MoneyoneySource;

/**
 * Created by tvalova on 22.09.2015.
 */
public interface IMoneySourceService {
    void findMoneySource(MoneyoneySource moneyoneySource);
    void save(MoneyoneySource moneyoneySource);
}
