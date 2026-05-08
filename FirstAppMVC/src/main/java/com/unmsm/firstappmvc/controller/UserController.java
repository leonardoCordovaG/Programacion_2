package com.unmsm.firstappmvc.controller;

import com.unmsm.firstappmvc.model.User;
import com.unmsm.firstappmvc.view.UserView;

/**
 *
 * @author kepler
 */
public class UserController {

    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        view.showWindow(); // primero abrir ventana 

        String message = "Hola " + model.getName();
        view.showGreeting(message);
    }
}
