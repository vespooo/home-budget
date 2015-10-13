package daoTests;

import configurations.TestConfig;
import dao.data.MoneySource;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.IInstallService;
import service.IMoneySourceService;

/**
 * Created by tvalova on 22.09.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("development")
public class MoneySourceServiceTest {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private IMoneySourceService service;

    @Autowired
    IInstallService installService;

    @Before
    public void before()
    {
        installService.dropAll();
        installService.installMoneySourceTable();
    }
    //@After
    public void after()
    {
        installService.dropAll();
    }

    @Test
    public void test()
    {
        MoneySource moneySoure = new MoneySource();
        moneySoure.setName("gfh");
        service.save(moneySoure);
    }
}
