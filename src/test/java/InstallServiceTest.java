import configurations.TestConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.IInstallService;

/**
 * Created by tvalova on 17.09.2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Rollback
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("development")
public class InstallServiceTest {


    @Autowired
    IInstallService service;

    @Before
    public void before()
    {
        service.installGoalTable();
    }
    @After
    public void after()
    {
        service.dropAll();
    }


    @Test
    public void testInstallGoalTable()
    {
        service.installGoalTable();
    }

    @Test
    public void testInstallMoneySourceTable()
    {
        service.installMoneySourceTable();
    }

    @Test
    public void testInstallMoneySourceFactTable()
    {
        service.installMoneySourceFactTable();
    }

    @Test
    public void testInstallPlansTable()
    {
        service.installPlansTable();
    }

    @Test
    public void testInstallPartitionTable()
    {
        service.installPartitionTable();
    }

    @Test
    public void testInstallPartitionFactTable()
    {
        service.installPartitionFactTable();
    }
}
