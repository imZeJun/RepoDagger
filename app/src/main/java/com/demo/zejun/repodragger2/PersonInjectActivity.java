package com.demo.zejun.repodragger2;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

/**
 * @author lizejun
 * @version 1.0 2016/11/13
 */
public class PersonInjectActivity extends Activity {

    @Inject
    Person mPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerPersonInjectComponent.builder().personDataModule(new PersonDataModule()).build().inject(this);
        System.out.println("Person name=" + mPerson.getName());
    }
}
