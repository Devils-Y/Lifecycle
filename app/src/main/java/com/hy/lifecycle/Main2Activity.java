package com.hy.lifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

     private static final String TAG = "Main2Activity";

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          Log.e(TAG, "---->----onCreate---->-----");
          setContentView(R.layout.activity_main2);
     }

     @Override
     protected void onStart() {
          super.onStart();
          Log.e(TAG, "---->----onStart---->-----");
     }

     @Override
     protected void onResume() {
          super.onResume();
          Log.e(TAG, "---->----onResume---->-----");
     }

     @Override
     protected void onPause() {
          super.onPause();
          Log.e(TAG, "---->----onPause---->-----");
     }

     @Override
     protected void onStop() {
          super.onStop();
          Log.e(TAG, "---->----onStop---->-----");
     }

     @Override
     protected void onDestroy() {
          super.onDestroy();
          Log.e(TAG, "---->----onDestroy---->-----");
     }

     @Override
     protected void onRestart() {
          super.onRestart();
          Log.e(TAG, "---->----onRestart---->-----");
     }
}
