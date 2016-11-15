package com.demo.zejun.repodragger2.foodapp;

import android.app.Application;

import com.demo.zejun.repodragger2.foodapp.data.source.DaggerFoodsRepositoryComponent;
import com.demo.zejun.repodragger2.foodapp.data.source.FoodsRepositoryComponent;

/**
 * @author lizejun
 * @version 1.0 2016/11/14
 */
public class FoodApplication extends Application {

    private FoodsRepositoryComponent mFoodsRepositoryComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mFoodsRepositoryComponent = DaggerFoodsRepositoryComponent
                .builder()
                .applicationModule(new ApplicationModule(getApplicationContext()))
                .build();
    }

    public FoodsRepositoryComponent getFoodsRepositoryComponent() {
        return mFoodsRepositoryComponent;
    }
}
