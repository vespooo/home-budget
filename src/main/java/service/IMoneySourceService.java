package service;

import dao.data.MoneySource;

/**
 * Created by tvalova on 22.09.2015.
 */
public interface IMoneySourceService {
    void findMoneySource(MoneySource moneySource);
    void save(MoneySource moneySource);
}
