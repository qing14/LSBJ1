package com.bwie.asus.lsbj1;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class WeekTitleViewGroup extends LinearLayout {
    Context mcontext;

    public WeekTitleViewGroup(Context context) {
        super(context);
        mcontext = context;
    }

    public WeekTitleViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mcontext=context;
        init();
    }

    private void init() {
        View view=View.inflate(mcontext,R.layout.title_week,null);
    }
}
