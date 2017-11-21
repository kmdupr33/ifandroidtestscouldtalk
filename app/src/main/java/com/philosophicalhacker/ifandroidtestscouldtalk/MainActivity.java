package com.philosophicalhacker.ifandroidtestscouldtalk;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  static final String FRAG_TAG = "RATE_FRAG_TAG";

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void showRateDialog() {
    new MyDialogFragment().show(getSupportFragmentManager(), FRAG_TAG);
  }

  public static class MyDialogFragment extends DialogFragment {
    @NonNull @Override public Dialog onCreateDialog(Bundle savedInstanceState) {
      return new AlertDialog.Builder(getContext()).setTitle("Would you like to rate the app?")
          .setPositiveButton("yes", null)
          .create();
    }
  }
}
