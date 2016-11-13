package com.demo.zejun.repodragger2;

import dagger.Component;

/**
 * @author lizejun
 * @version 1.0 2016/11/12
 */

@Component(modules = {PersonDataModule.class})
public interface PersonInjectComponent {
    void inject(PersonInjectActivity injectActivity);
}
