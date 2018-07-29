package zjc.com.yuekaomoni.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化视图
        setContentView(createView());
        //初始化控件
        initView();
        //初始化数据
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int createView();
}
