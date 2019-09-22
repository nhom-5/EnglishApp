package com.example.myapplication.ui.minitest;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MinitestViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MinitestViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is minitext fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}