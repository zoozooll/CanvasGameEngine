package com.aaron.engine;

import android.view.View;

public class Director implements Ref {

    private View showView;


    @Override
    public void release() {

    }

    public View getShowView() {
        return showView;
    }

    public void setShowView(View showView) {
        this.showView = showView;
    }

    void stopAnimation() {

    }

    void startAnimation() {

    }
}
