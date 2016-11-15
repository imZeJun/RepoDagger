package com.demo.zejun.repodragger2.foodapp.foods;

import com.demo.zejun.repodragger2.foodapp.util.ActivityScoped;

import dagger.Module;
import dagger.Provides;

/**
 * @author lizejun
 * @version 1.0 2016/11/15
 */
@Module
public class FoodsPresenterModule {

    private final FoodsContract.View mView;

    public FoodsPresenterModule(FoodsContract.View view) {
        mView = view;
    }

    @Provides
    @ActivityScoped
    FoodsContract.View provideFoodsContractView() {
        return mView;
    }
}
