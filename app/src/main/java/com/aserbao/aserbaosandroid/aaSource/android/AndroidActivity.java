package com.aserbao.aserbaosandroid.aaSource.android;

import android.view.View;

import com.aserbao.aserbaosandroid.aaSource.android.accessibilityservice.AccessibilityServiceActivity;
import com.aserbao.aserbaosandroid.aaSource.android.app.AppActivity;
import com.aserbao.aserbaosandroid.aaSource.android.material.MaterialActivity;
import com.aserbao.aserbaosandroid.aaSource.android.support.SupportActivity;
import com.aserbao.aserbaosandroid.aaSource.android.widget.Classes.AndroidWidgetClasses;
import com.example.base.base.BaseRecyclerViewActivity;
import com.example.base.base.beans.BaseRecyclerBean;

public class AndroidActivity extends BaseRecyclerViewActivity {

    @Override
    public void initGetData() {
        mBaseRecyclerBean.add(new BaseRecyclerBean("App", AppActivity.class));
        mBaseRecyclerBean.add(new BaseRecyclerBean("Material", MaterialActivity.class));
        mBaseRecyclerBean.add(new BaseRecyclerBean("Support", SupportActivity.class));
        mBaseRecyclerBean.add(new BaseRecyclerBean("AccessibilityService", AccessibilityServiceActivity.class));
        mBaseRecyclerBean.add(new BaseRecyclerBean("widget.Classes", AndroidWidgetClasses.class));
    }

    @Override
    public void itemClickBack(View view, int position, boolean isLongClick, int comeFrom) {

    }
}
