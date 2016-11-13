package com.demo.zejun.repodragger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author lizejun
 * @version 1.0 2016/11/13
 */
@Module
public class AnSingleObjectDataModule {

    @Provides
    @Singleton
    AnSingleObject provideAnSingleObject() {
        return new AnSingleObject();
    }
}
