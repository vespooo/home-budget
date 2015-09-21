package configurations;

import dao.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import service.*;

import javax.sql.DataSource;


/**
 * Created by tvalova on 17.09.2015.
 */

@Configuration
@ComponentScan
@Profile("development")
public class TestConfig {

    @Bean
    public IGoalDao goalDao()
    {
        return new GoalDao();
    }

    @Bean
    public IGoalService goalService()
    {
        return new GoalService();
    }

    @Bean
    public IInstallService installService()
    {
        return new InstallTestDBSevice();
    }

    @Bean
    public IInstallDao installDao()
    {
       return new InstallDao();
    }


    @Bean
    public ICommonService globalService()
    {
        return new CommonSevice();
    }

    @Bean
    public ICommonDao globalDao()
    {
        return new CommonDao();
    }


    @Bean
    public IJdbcWrap jdbcWrap()
    {
        return new JdbcWrap(dataSource());
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
       ds.setDriverClassName("org.h2.Driver");
        ds.setUrl("jdbc:h2:file:D:/IdeaProjects/economy/H2");
        ds.setUsername("");
        ds.setPassword("");
        return ds;
    }
}
