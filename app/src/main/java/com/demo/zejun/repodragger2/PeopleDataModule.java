package com.demo.zejun.repodragger2;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author lizejun
 * @version 1.0 2016/11/13
 */
@Module
public class PeopleDataModule {

    @Provides
    @Named("Five People")
    People provideFivePeople() {
        return new People(5);
    }

    @Provides
    @Named("Ten People")
    People provideTenPeople() {
        return new People(10);
    }

    @Provides
    @PeopleThreeQualifier
    People provideThreePeople() {
        return new People(3);
    }
}
