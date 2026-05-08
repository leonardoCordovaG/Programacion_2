package com.unmsm.firstappmvc;

import com.unmsm.firstappmvc.controller.UserController;
import com.unmsm.firstappmvc.model.User;
import com.unmsm.firstappmvc.view.UserView;

// @author kepler
public class FirstAppMVC {

    public static void main(String[] args) {

        User model = new User("Kepler");
        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        controller.run();
    }
}
