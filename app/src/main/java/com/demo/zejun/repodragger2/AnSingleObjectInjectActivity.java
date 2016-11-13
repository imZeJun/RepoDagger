package com.demo.zejun.repodragger2;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

/**
 * @author lizejun
 * @version 1.0 2016/11/13
 */
public class AnSingleObjectInjectActivity extends Activity {

    @Inject
    AnSingleObject object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AnSingleObjectInjectComponent.getInstance().inject(this);
        System.out.println("AnSingleObject id=" + object.getObjectId());
    }
}
