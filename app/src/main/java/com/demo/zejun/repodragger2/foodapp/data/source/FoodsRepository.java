package com.demo.zejun.repodragger2.foodapp.data.source;

import com.demo.zejun.repodragger2.foodapp.data.Food;

import java.util.List;

import javax.inject.Inject;

/**
 * @author lizejun
 * @version 1.0 2016/11/15
 */
public class FoodsRepository implements FoodsDataSource{

    private final FoodsDataSource mFoodsRemoteDataSource;

    @Inject
    FoodsRepository(@Remote FoodsDataSource foodsRemoteDataSource) {
        mFoodsRemoteDataSource = foodsRemoteDataSource;
    }

    @Override
    public void getFoods(final LoadFoodsCallback callback) {
        mFoodsRemoteDataSource.getFoods(new LoadFoodsCallback() {

            @Override
            public void onFoodsLoaded(List<Food> foods) {
                callback.onFoodsLoaded(foods);
            }

            @Override
            public void onDataNotAvailable() {
                callback.onDataNotAvailable();
            }
        });
    }
}
