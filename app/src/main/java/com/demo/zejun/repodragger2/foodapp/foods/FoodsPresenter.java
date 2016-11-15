package com.demo.zejun.repodragger2.foodapp.foods;

import com.demo.zejun.repodragger2.foodapp.data.Food;
import com.demo.zejun.repodragger2.foodapp.data.source.FoodsDataSource;
import com.demo.zejun.repodragger2.foodapp.data.source.FoodsRepository;

import java.util.List;

import javax.inject.Inject;

/**
 * @author lizejun
 * @version 1.0 2016/11/15
 */
public final class FoodsPresenter implements FoodsContract.Presenter {

    private final FoodsRepository mFoodsRepository;
    private final FoodsContract.View mFoodsView;

    @Inject
    FoodsPresenter(FoodsRepository foodsRepository, FoodsContract.View foodsView) {
        mFoodsRepository = foodsRepository;
        mFoodsView = foodsView;
    }

    @Inject
    void setupListener() {
        mFoodsView.setPresenter(this);
    }

    @Override
    public void start() {
        loadFoods();
    }

    @Override
    public void loadFoods() {
        mFoodsRepository.getFoods(new FoodsDataSource.LoadFoodsCallback() {

            @Override
            public void onFoodsLoaded(List<Food> foods) {
                mFoodsView.showFoods(foods);
            }

            @Override
            public void onDataNotAvailable() {

            }

        });
    }
}
