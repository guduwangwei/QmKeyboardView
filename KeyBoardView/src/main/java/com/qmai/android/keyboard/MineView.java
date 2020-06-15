package com.qmai.android.keyboard;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.qmai.android.keyboardview.R;

/**
 * created by wangwei   ON 6/14/20  email:wangwei_5521@163.com
 *
 * @version 1.1.1
 * @Description
 **/
class MineView extends View {
    public MineView(Context context) {
        this(context, null);
    }

    public MineView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, R.attr.mineViewStyle);

    }

    public MineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MineView,defStyleAttr,0);
        for (int i = 0; i < a.getIndexCount(); i++) {
            int attrIndex = a.getIndex(i);
            if (attrIndex == R.styleable.MineView_title) {
                String title = a.getString(attrIndex);
                System.out.println("title = "+title);
            }
        }
        a.recycle();


    }


}
