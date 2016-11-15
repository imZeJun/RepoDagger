package com.demo.zejun.repodragger2.foodapp.foods;

import com.demo.zejun.repodragger2.foodapp.data.source.FoodsRepositoryComponent;
import com.demo.zejun.repodragger2.foodapp.util.ActivityScoped;

import dagger.Component;

/**
 * @author lizejun
 * @version 1.0 2016/11/15
 */
@ActivityScoped
@Component(dependencies = FoodsRepositoryComponent.class, modules = FoodsPresenterModule.class)
public interface FoodsComponent {
    void inject(FoodsActivity foodsActivity);
}
