package com.example.myapplication.ui.fulltest;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FulltestViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FulltestViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Fulltest fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}