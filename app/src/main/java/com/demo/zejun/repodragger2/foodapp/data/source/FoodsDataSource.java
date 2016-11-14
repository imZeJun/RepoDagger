package com.demo.zejun.repodragger2.foodapp.data.source;

import com.demo.zejun.repodragger2.foodapp.data.Food;

import java.util.List;

/**
 * @author lizejun
 * @version 1.0 2016/11/15
 */
public interface FoodsDataSource {

    interface  LoadFoodsCallback {

        void onFoodsLoaded(List<Food> foods);

        void onDataNotAvailable();
    }

    void getFoods(LoadFoodsCallback callback);
}
