package com.demo.zejun.repodragger2;

import dagger.Module;
import dagger.Provides;

/**
 * @author lizejun
 * @version 1.0 2016/11/12
 */
@Module
public class PersonDataModule {

    @Provides
    public Person providePerson() {
        return new Person();
    }
}
