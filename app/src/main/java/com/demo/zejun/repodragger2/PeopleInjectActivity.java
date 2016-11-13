package com.demo.zejun.repodragger2;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author lizejun
 * @version 1.0 2016/11/13
 */
public class PeopleInjectActivity extends Activity {

    @Inject
    @Named("Five People")
    People mFivePeople;

    @Inject
    @Named("Ten People")
    People mTenPeople;

    @Inject
    @PeopleThreeQualifier
    People mThreePeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerPeopleInjectComponent.builder().peopleDataModule(new PeopleDataModule()).build().inject(this);
        System.out.println("Five People=" + mFivePeople.getCount() + ",Ten People=" + mTenPeople.getCount() + ", Three People=" + mThreePeople.getCount());

    }
}
