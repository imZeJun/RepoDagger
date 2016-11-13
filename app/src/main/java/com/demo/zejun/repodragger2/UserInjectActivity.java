package com.demo.zejun.repodragger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.lang.reflect.Method;
import javax.inject.Inject;

public class UserInjectActivity extends AppCompatActivity {

    @Inject
    public User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragger2);
        DaggerUserInjectComponent.create().inject(this);
        System.out.println("User name=" + mUser.getName());
    }

    private void getMethodInfoAnnotation() {
        Class cls = RuntimeMethodInfoTest.class;
        for (Method method : cls.getMethods()) {
            RuntimeMethodInfo runtimeMethodInfo = method.getAnnotation(RuntimeMethodInfo.class);
            if (runtimeMethodInfo != null) {
                System.out.println("RuntimeMethodInfo author=" + runtimeMethodInfo.author());
                System.out.println("RuntimeMethodInfo data=" + runtimeMethodInfo.data());
                System.out.println("RuntimeMethodInfo version=" + runtimeMethodInfo.version());
            }
        }
    }
}
