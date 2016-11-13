package com.demo.zejun.repodragger2;

import javax.inject.Inject;

/**
 * @author lizejun
 * @version 1.0 2016/11/12
 */
public class User {

    public String name;

    @Inject
    public User() {
        name = "lizejun";
    }

    public String getName() {
        return name;
    }
}
