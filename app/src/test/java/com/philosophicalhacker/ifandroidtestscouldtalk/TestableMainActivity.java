package com.philosophicalhacker.ifandroidtestscouldtalk;

import android.support.v4.app.FragmentManager;

public class TestableMainActivity extends MainActivity {

  @Override public FragmentManager getSupportFragmentManager() {
    return super.getSupportFragmentManager();
  }
}
