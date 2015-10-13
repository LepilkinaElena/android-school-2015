package com.elegion.githubclient;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Елена on 13.10.2015.
 */
public class RepItemDecoration extends RecyclerView.ItemDecoration {

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        float paddingMedium = view.getContext().getResources().getDimension(R.dimen.padding_medium);
        outRect.bottom = (int)paddingMedium;
        outRect.top = (int)paddingMedium;
        outRect.right = (int)paddingMedium;
        outRect.left = (int)paddingMedium;
    }
}
