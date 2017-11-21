package com.philosophicalhacker.ifandroidtestscouldtalk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTests {
  @Mock MainActivity mainActivity;
  @Test public void presenterShowsRateDialogOnFirstAppRun() throws Exception {
    MainPresenter mainPresenter = new MainPresenter(mainActivity);
    mainPresenter.present();
    verify(mainActivity).showRateDialog();
  }
}
