package com.demo.zejun.repodragger2.foodapp.data.source;

import com.demo.zejun.repodragger2.foodapp.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author lizejun
 * @version 1.0 2016/11/15
 */
@Component(modules = {FoodsRepositoryModule.class, ApplicationModule.class})
@Singleton
public interface FoodsRepositoryComponent {
    FoodsRepository getFoodsRepository();
}
