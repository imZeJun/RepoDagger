package com.demo.zejun.repodragger2.foodapp.data.source.remote;

import android.os.Handler;

import com.demo.zejun.repodragger2.foodapp.data.Food;
import com.demo.zejun.repodragger2.foodapp.data.source.FoodsDataSource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizejun
 * @version 1.0 2016/11/15
 */
public class FoodsRemoteDataSource implements FoodsDataSource {

    private static final int SERVICE_LATENCY_IN_MILLIS = 5000;

    private final static List<Food> FOODS_SERVICE_DATA;

    static {
        FOODS_SERVICE_DATA = new ArrayList<>();
        FOODS_SERVICE_DATA.add(new Food("Apple", 5));
        FOODS_SERVICE_DATA.add(new Food("Banana", 10));
        FOODS_SERVICE_DATA.add(new Food("Orange", 15));
    }

    @Override
    public void getFoods(final LoadFoodsCallback callback) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                callback.onFoodsLoaded(FOODS_SERVICE_DATA);
            }
        }, SERVICE_LATENCY_IN_MILLIS);
    }
}
