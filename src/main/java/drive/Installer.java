package drive;

import org.springframework.beans.factory.annotation.Autowired;
import service.IInstallService;

/**
 * Created by tvalova on 18.09.2015.
 */
public class Installer {

    @Autowired
    IInstallService service;

    public void install()
    {
        service.installGoalTable();
        service.installMoneySourceTable();
        service.installMoneySourceFactTable();
    }
}
