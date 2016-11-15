package com.demo.zejun.repodragger2.foodapp.foods;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.demo.zejun.repodragger2.R;
import com.demo.zejun.repodragger2.foodapp.FoodApplication;
import com.demo.zejun.repodragger2.foodapp.data.Food;
import com.demo.zejun.repodragger2.foodapp.data.source.DaggerFoodsRepositoryComponent;

import java.util.List;

import javax.inject.Inject;

/**
 * @author lizejun
 * @version 1.0 2016/11/15
 */
public class FoodsActivity extends Activity implements FoodsContract.View {

    @Inject
    private FoodsPresenter mPresenter;

    private TextView mFoodsContentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);
        mFoodsContentView = (TextView) findViewById(R.id.foods_content);
        DaggerFoodsComponent.builder()
                .foodsRepositoryComponent(((FoodApplication) getApplicationContext()).getFoodsRepositoryComponent())
                .foodsPresenterModule(new FoodsPresenterModule((FoodsContract.View) this)).build()
                .inject(this);

    }

    @Override
    public void showFoods(List<Food> foods) {
        StringBuilder builder = new StringBuilder();
        for (Food food : foods) {
            builder.append(food.toString());
            builder.append("||");
        }
        mFoodsContentView.setText(builder.toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void setPresenter(FoodsContract.Presenter presenter) {
        mPresenter = (FoodsPresenter) presenter;
    }
}
