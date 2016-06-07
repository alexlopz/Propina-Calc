package com.androidegt.android.tipcal.fragments;

import com.androidegt.android.tipcal.models.TipRecord;

/**
 * Created by Alex on 5/06/16.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
