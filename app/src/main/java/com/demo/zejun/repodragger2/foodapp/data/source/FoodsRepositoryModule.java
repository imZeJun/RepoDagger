package com.demo.zejun.repodragger2.foodapp.data.source;

import com.demo.zejun.repodragger2.foodapp.data.source.remote.FoodsRemoteDataSource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author lizejun
 * @version 1.0 2016/11/15
 */
@Module
public class FoodsRepositoryModule {

    @Provides
    @Singleton
    @Remote
    FoodsDataSource provideFoodsRemoteDataSource() {
        return new FoodsRemoteDataSource();
    }

}
