package com.demo.zejun.repodragger2.foodapp.foods;

import com.demo.zejun.repodragger2.foodapp.BasePresenter;
import com.demo.zejun.repodragger2.foodapp.BaseView;
import com.demo.zejun.repodragger2.foodapp.data.Food;

import java.util.List;

/**
 * @author lizejun
 * @version 1.0 2016/11/15
 */
public interface FoodsContract {

    interface View extends BaseView<Presenter> {
        void showFoods(List<Food> foods);
    }

    interface Presenter extends BasePresenter {
        void loadFoods();
    }
}
