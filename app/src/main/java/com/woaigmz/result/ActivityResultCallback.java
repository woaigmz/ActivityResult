package com.woaigmz.result;

import android.annotation.SuppressLint;

/**
 * Created by haoran on 2020/4/22.
 */
public interface ActivityResultCallback<O> {
    void onGetResult(@SuppressLint("UnknownNullness") O result);
}
