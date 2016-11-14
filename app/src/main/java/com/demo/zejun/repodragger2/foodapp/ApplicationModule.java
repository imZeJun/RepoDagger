package com.demo.zejun.repodragger2.foodapp;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * @author lizejun
 * @version 1.0 2016/11/15
 */
@Module
public final class ApplicationModule {

    private final Context mContext;

    ApplicationModule(Context context) {
        this.mContext = context;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }
}
