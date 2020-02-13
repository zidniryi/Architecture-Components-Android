package com.zidniryi.viemmodel;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int clickCount=0;


    public  int getInitialCount(){

        return clickCount;
    }

    public  int getCurrentCount(){

        clickCount+=1;
        return clickCount;
    }
}
