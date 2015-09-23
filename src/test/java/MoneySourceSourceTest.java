package PACKAGE_NAME;

import data.MoneyoneySource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.IInstallService;
import service.IMoneySourceService;
import service.MoneySourceService;

/**
 * Created by tvalova on 22.09.2015.
 */
public class MoneySourceSourceTest {

    @Autowired
    private IMoneySourceService service;

    @Autowired
    IInstallService installService;

    @Before
    public void before()
    {
        installService.installGoalTable();
    }
    @After
    public void after()
    {
        installService.dropAll();
    }

    @Test
    public void test()
    {
        MoneyoneySource moneySoure = new MoneyoneySource();
        moneySoure.setName("gfh");
        service.save(moneySoure);
    }
}
