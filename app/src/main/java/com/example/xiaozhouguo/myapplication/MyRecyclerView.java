package com.example.xiaozhouguo.myapplication;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class MyRecyclerView extends RecyclerView {
    MineRadioAdapter mineRadioAdapter;
    public MyRecyclerView(Context context) {
        super(context);
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setMineRadioAdapter(MineRadioAdapter adapter){
        this.mineRadioAdapter=adapter;
    }

    @Override
    public void onScrollStateChanged(int state) {
        mineRadioAdapter.isAnimate=false;
        super.onScrollStateChanged(state);

    }
}
