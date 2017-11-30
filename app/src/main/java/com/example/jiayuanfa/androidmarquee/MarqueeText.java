package com.example.jiayuanfa.androidmarquee;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 第一步： 设置 ellipsize = "marquee" focusable = "true" focusableInTouchMode = "true" singleLine = "true"
 * 第二步： 自定义下面的这个类
 * Created by JiaYuanFa on 2017/11/30.
 */

public class MarqueeText extends android.support.v7.widget.AppCompatTextView {

    public MarqueeText(Context context) {
        super(context);
    }

    public MarqueeText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MarqueeText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 当前这个View是不是被选中的状态 我们强制设置为true 即可 让其同时被选中
     * @return true
     */
    @Override
    public boolean isFocused() {
        return true;
    }
}
