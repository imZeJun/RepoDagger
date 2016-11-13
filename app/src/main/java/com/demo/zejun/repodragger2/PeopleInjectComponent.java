package com.demo.zejun.repodragger2;

import dagger.Component;
import dagger.Module;

/**
 * @author lizejun
 * @version 1.0 2016/11/13
 */
@Component(modules = PeopleDataModule.class)
public interface PeopleInjectComponent {
    void inject(PeopleInjectActivity peopleInjectActivity);
}
