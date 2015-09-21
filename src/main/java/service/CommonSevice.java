package service;

import dao.ICommonDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tvalova on 19.09.2015.
 */
public class CommonSevice implements ICommonService {

    @Autowired
    ICommonDao dao;

    @Override
    public void dropAll() {
        dao.dropAll();
    }
}
