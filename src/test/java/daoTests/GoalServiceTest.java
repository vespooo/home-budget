package daoTests;

import configurations.TestConfig;
import junit.framework.TestCase;
import dao.data.Goal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.IGoalService;
import service.IInstallService;

/**
 * Created by tvalova on 17.09.2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("development")
public class GoalServiceTest {


    @Autowired
    IGoalService service;

    @Autowired
    IInstallService installService;

    @Before
    public void before()
    {
        installService.dropAll();
        installService.installGoalTable();
    }
    //@After
    public void after()
    {
        installService.dropAll();
    }

    @Test
    @Rollback
    public void testGoalNotFound()
    {
        Goal goal = service.find("fff");
        TestCase.assertTrue(goal == null);
    }

    @Test
    @Rollback
    public void testGoalFound()
    {
        String goalName = "fff";
        service.save(createGoal(goalName));
//        Goal goal = service.find(goalName);
//        TestCase.assertTrue(goal != null);
//        TestCase.assertTrue(goal.getName() == goalName);
    }


    private Goal createGoal(String name) {
        Goal goal = new Goal();
        goal.setName(name);
        return goal;
    }
}
