package com.socks.jiandan.ui.fragment;

import android.os.Bundle;

import com.socks.jiandan.model.Picture;

/**
 * 妹子图
 */
public class SisterFragment extends PictureFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        mType = Picture.PictureType.Sister;
    }
}
