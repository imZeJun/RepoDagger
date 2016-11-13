package com.demo.zejun.repodragger2;

import javax.inject.Singleton;
import dagger.Component;

/**
 * @author lizejun
 * @version 1.0 2016/11/13
 */
@Component(modules = {AnSingleObjectDataModule.class})
@Singleton
public abstract class AnSingleObjectInjectComponent {

    private static AnSingleObjectInjectComponent sInstance;

    public abstract void inject(AnSingleObjectInjectActivity anSingleObjectInjectActivity);

    public static AnSingleObjectInjectComponent getInstance() {
        if (sInstance == null) {
            sInstance = DaggerAnSingleObjectInjectComponent.create();
        }
        return sInstance;
    }

}
